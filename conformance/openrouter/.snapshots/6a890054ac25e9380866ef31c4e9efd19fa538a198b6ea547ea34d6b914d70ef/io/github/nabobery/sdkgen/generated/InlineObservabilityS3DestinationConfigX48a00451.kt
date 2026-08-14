package io.github.nabobery.sdkgen.generated

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
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ObservabilityS3Destination/properties/config
 */
@Serializable(with = InlineObservabilityS3DestinationConfigX48a00451.Serializer::class)
public class InlineObservabilityS3DestinationConfigX48a00451(
  public val accessKeyId: String,
  public val bucketName: String,
  public val secretAccessKey: String,
  /**
   * Only for S3-compatible services like Cloudflare R2 (https://account-id.r2.cloudflarestorage.com) or MinIO. Leave
   * blank for standard AWS S3.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val endpoint: String? = null,
  headers: Map<String, String>? = null,
  /**
   * Template for S3 object path. The filename ({traceId}-{timestamp}.json) is automatically appended. Available
   * variables: {prefix}, {date}, {year}, {month}, {day}, {apiKeyName}
   */
  public val pathTemplate: String? = null,
  public val prefix: String? = null,
  public val region: String? = null,
  public val sessionToken: String? = null,
) {
  /**
   * Custom HTTP headers to include in requests to this destination.
   */
  public val headers: Map<String, String>? = headers?.let { collection0 -> collection0.toMap() }

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
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var endpoint: String? = null

    private var headersValue: Map<String, String>? = null

    /**
     * Custom HTTP headers to include in requests to this destination.
     */
    public var headers: Map<String, String>?
      get() = headersValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        headersValue = value?.let { collection0 -> collection0.toMap() }
      }

    /**
     * Template for S3 object path. The filename ({traceId}-{timestamp}.json) is automatically appended. Available
     * variables: {prefix}, {date}, {year}, {month}, {day}, {apiKeyName}
     */
    public var pathTemplate: String? = null

    public var prefix: String? = null

    public var region: String? = null

    public var sessionToken: String? = null

    public fun build(): InlineObservabilityS3DestinationConfigX48a00451 {
      check(accessKeyIdValue != null) { "accessKeyId is required" }
      check(bucketNameValue != null) { "bucketName is required" }
      check(secretAccessKeyValue != null) { "secretAccessKey is required" }
      return InlineObservabilityS3DestinationConfigX48a00451(
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
    public fun build(block: Builder.() -> Unit): InlineObservabilityS3DestinationConfigX48a00451 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineObservabilityS3DestinationConfigX48a00451> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineObservabilityS3DestinationConfigX48a00451 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineObservabilityS3DestinationConfigX48a00451")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineObservabilityS3DestinationConfigX48a00451 must be a JSON object")
      val accessKeyId = json.decodeRequired<String>(rawObject, "accessKeyId")
      val bucketName = json.decodeRequired<String>(rawObject, "bucketName")
      val secretAccessKey = json.decodeRequired<String>(rawObject, "secretAccessKey")
      return InlineObservabilityS3DestinationConfigX48a00451(
        accessKeyId = accessKeyId,
        bucketName = bucketName,
        secretAccessKey = secretAccessKey,
        endpoint = rawObject["endpoint"]?.let { json.decodeFromJsonElement<String>(it) },
        headers = rawObject["headers"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        pathTemplate = rawObject["pathTemplate"]?.let { json.decodeFromJsonElement<String>(it) },
        prefix = rawObject["prefix"]?.let { json.decodeFromJsonElement<String>(it) },
        region = rawObject["region"]?.let { json.decodeFromJsonElement<String>(it) },
        sessionToken = rawObject["sessionToken"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineObservabilityS3DestinationConfigX48a00451) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineObservabilityS3DestinationConfigX48a00451")
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

public fun inlineObservabilityS3DestinationConfigX48a00451(block: InlineObservabilityS3DestinationConfigX48a00451.Builder.() -> Unit): InlineObservabilityS3DestinationConfigX48a00451 = InlineObservabilityS3DestinationConfigX48a00451.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineObservabilityS3DestinationConfigX48a00451 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
