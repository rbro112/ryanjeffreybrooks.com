config.resolve.modules.push("processedResources/js/main");

config.module.rules.push({
    test: /\.css$/,
    use: ['style-loader', 'css-loader']
});