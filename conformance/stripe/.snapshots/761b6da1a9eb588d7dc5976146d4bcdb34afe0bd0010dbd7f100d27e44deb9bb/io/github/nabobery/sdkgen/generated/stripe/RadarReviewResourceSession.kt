package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class RadarReviewResourceSessionView(
  public val browser: String? = null,
  public val device: String? = null,
  public val platform: String? = null,
  public val version: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/radar_review_resource_session
 */
@Serializable(with = RadarReviewResourceSession.Serializer::class)
public class RadarReviewResourceSession(
  /**
   * The browser used in this browser session (e.g., `Chrome`).
   */
  public val browser: String? = null,
  /**
   * Information about the device used for the browser session (e.g., `Samsung SM-G930T`).
   */
  public val device: String? = null,
  /**
   * The platform for the browser session (e.g., `Macintosh`).
   */
  public val platform: String? = null,
  /**
   * The version for the browser session (e.g., `61.0.3163.100`).
   */
  public val version: String? = null,
) {
  public class Builder {
    /**
     * The browser used in this browser session (e.g., `Chrome`).
     */
    public var browser: String? = null

    /**
     * Information about the device used for the browser session (e.g., `Samsung SM-G930T`).
     */
    public var device: String? = null

    /**
     * The platform for the browser session (e.g., `Macintosh`).
     */
    public var platform: String? = null

    /**
     * The version for the browser session (e.g., `61.0.3163.100`).
     */
    public var version: String? = null

    public fun build(): RadarReviewResourceSession = RadarReviewResourceSession(
      browser = browser,
      device = device,
      platform = platform,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RadarReviewResourceSession = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RadarReviewResourceSession> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RadarReviewResourceSession {
      val jsonDecoder = decoder.requireJsonDecoder("RadarReviewResourceSession")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RadarReviewResourceSession must be a JSON object")
      return RadarReviewResourceSession(
        browser = rawObject["browser"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        device = rawObject["device"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        platform = rawObject["platform"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: RadarReviewResourceSession) {
      val jsonEncoder = encoder.requireJsonEncoder("RadarReviewResourceSession")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.browser?.let { put("browser", it) }
        value.device?.let { put("device", it) }
        value.platform?.let { put("platform", it) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun radarReviewResourceSession(block: RadarReviewResourceSession.Builder.() -> Unit): RadarReviewResourceSession = RadarReviewResourceSession.build(block)
