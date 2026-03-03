# Frontend Dockerfile
#FROM node:18

#WORKDIR /app

# Use official npm registry to avoid local mirror issues
#RUN npm config set registry https://registry.npmjs.org/

# Copy dependency files first for caching
#COPY package*.json ./

# Install dependencies (ignore peer dependency errors, force fresh install)
#RUN npm install 

# Ensure react-scripts is installed locally
#RUN npm install react-scripts --save --legacy-peer-deps

# Copy the rest of the frontend code
#COPY . .

# Build React app
#RUN npm run build

# Install serve globally for production
#RUN npm install -g serve

# Expose the frontend port
#EXPOSE  80 

# Serve the build folder
#CMD ["serve", "-s", "build", "-l", "3000"]




# Step 1: Use Nginx base image
FROM nginx:alpine

# Step 2: Remove default Nginx config
RUN rm /etc/nginx/conf.d/default.conf

# Step 3: Copy your custom config
COPY default.conf /etc/nginx/conf.d/

# Step 4: Copy React build output to Nginx HTML folder
COPY build/ /usr/share/nginx/html/

# Step 5: Expose port
EXPOSE 80

# Step 6: Start Nginx
CMD ["nginx", "-g", "daemon off;"]













