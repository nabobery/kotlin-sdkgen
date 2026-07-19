package com.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ObservabilityS3Destination/properties/config.
 */
@Serializable(with = InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig.Serializer::class)
public class InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig(
  public val accessKeyId: String,
  public val bucketName: String,
  public val secretAccessKey: String,
  /**
   * Only for S3-compatible services like Cloudflare R2 (https://account-id.r2.cloudflarestorage.com) or MinIO. Leave
   * blank for standard AWS S3.
   */
  public val endpoint: String? = null,
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = null,
  /**
   * Template for S3 object path. The filename ({traceId}-{timestamp}.json) is automatically appended. Available
   * variables: {prefix}, {date}, {year}, {month}, {day}, {apiKeyName}
   */
  public val pathTemplate: String? = null,
  public val prefix: String? = null,
  public val region: String? = null,
  public val sessionToken: String? = null,
) {
  public class Builder {
    private var accessKeyIdValue: String? = null

    public var accessKeyId: String
      get() = requireNotNull(accessKeyIdValue) { "accessKeyId is required" }
      set(`value`) {
        accessKeyIdValue = value
      }

    private var bucketNameValue: String? = null

    public var bucketName: String
      get() = requireNotNull(bucketNameValue) { "bucketName is required" }
      set(`value`) {
        bucketNameValue = value
      }

    private var secretAccessKeyValue: String? = null

    public var secretAccessKey: String
      get() = requireNotNull(secretAccessKeyValue) { "secretAccessKey is required" }
      set(`value`) {
        secretAccessKeyValue = value
      }

    /**
     * Only for S3-compatible services like Cloudflare R2 (https://account-id.r2.cloudflarestorage.com) or MinIO. Leave
     * blank for standard AWS S3.
     */
    public var endpoint: String? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>? = null

    /**
     * Template for S3 object path. The filename ({traceId}-{timestamp}.json) is automatically appended. Available
     * variables: {prefix}, {date}, {year}, {month}, {day}, {apiKeyName}
     */
    public var pathTemplate: String? = null

    public var prefix: String? = null

    public var region: String? = null

    public var sessionToken: String? = null

    public fun build(): InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig {
      check(accessKeyIdValue != null) { "accessKeyId is required" }
      check(bucketNameValue != null) { "bucketName is required" }
      check(secretAccessKeyValue != null) { "secretAccessKey is required" }
      return InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig(
        accessKeyId = accessKeyId,
        bucketName = bucketName,
        secretAccessKey = secretAccessKey,
        endpoint = endpoint,
        headers = headers,
        pathTemplate = pathTemplate,
        prefix = prefix,
        region = region,
        sessionToken = sessionToken,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig =
      Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig must be a " +
          "JSON object")
      val accessKeyId = json.decodeRequired<String>(raw, "accessKeyId")
      val bucketName = json.decodeRequired<String>(raw, "bucketName")
      val secretAccessKey = json.decodeRequired<String>(raw, "secretAccessKey")
      return InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig(
        accessKeyId = accessKeyId,
        bucketName = bucketName,
        secretAccessKey = secretAccessKey,
        endpoint = raw["endpoint"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = raw["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        pathTemplate = raw["pathTemplate"]?.let { json.decodeFromJsonElement<String>(it) },
        prefix = raw["prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        region = raw["region"]?.let { json.decodeFromJsonElement<String>(it) },
        sessionToken = raw["sessionToken"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("accessKeyId", value.accessKeyId)
        put("bucketName", value.bucketName)
        put("secretAccessKey", value.secretAccessKey)
        value.endpoint?.let { put("endpoint", it) }
        value.headers?.let { put("headers", json.encodeToJsonElement(it)) }
        value.pathTemplate?.let { put("pathTemplate", it) }
        value.prefix?.let { put("prefix", it) }
        value.region?.let { put("region", it) }
        value.sessionToken?.let { put("sessionToken", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasObservabilityS3DestinationPropertiesConfig(block: InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig.Builder.() -> Unit): InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig = InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasObservabilityS3DestinationPropertiesConfig is missing " +
      "required property '" + name + "'")
  return decodeFromJsonElement(element)
}
