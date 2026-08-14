package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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

@Serializable
public data class PlatformEarningFeeSourceView(
  public val charge: String? = null,
  public val payout: String? = null,
  public val type: InlinePlatformEarningFeeSourceTypeXfde0079c,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/platform_earning_fee_source
 */
@Serializable(with = PlatformEarningFeeSource.Serializer::class)
public class PlatformEarningFeeSource(
  /**
   * Type of object that created the application fee.
   */
  public val type: InlinePlatformEarningFeeSourceTypeXfde0079c,
  /**
   * Charge ID that created this application fee.
   */
  public val charge: String? = null,
  /**
   * Payout ID that created this application fee.
   */
  public val payout: String? = null,
) {
  public class Builder {
    private var typeValue: InlinePlatformEarningFeeSourceTypeXfde0079c? = null

    public var type: InlinePlatformEarningFeeSourceTypeXfde0079c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * Charge ID that created this application fee.
     */
    public var charge: String? = null

    /**
     * Payout ID that created this application fee.
     */
    public var payout: String? = null

    public fun build(): PlatformEarningFeeSource {
      check(typeValue != null) { "type is required" }
      return PlatformEarningFeeSource(
        type = type,
        charge = charge,
        payout = payout,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PlatformEarningFeeSource = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PlatformEarningFeeSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PlatformEarningFeeSource {
      val jsonDecoder = decoder.requireJsonDecoder("PlatformEarningFeeSource")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PlatformEarningFeeSource must be a JSON object")
      val type = json.decodeRequired<InlinePlatformEarningFeeSourceTypeXfde0079c>(rawObject, "type")
      return PlatformEarningFeeSource(
        type = type,
        charge = rawObject["charge"]?.let { json.decodeFromJsonElement<String>(it) },
        payout = rawObject["payout"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PlatformEarningFeeSource) {
      val jsonEncoder = encoder.requireJsonEncoder("PlatformEarningFeeSource")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.charge?.let { put("charge", it) }
        value.payout?.let { put("payout", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun platformEarningFeeSource(block: PlatformEarningFeeSource.Builder.() -> Unit): PlatformEarningFeeSource = PlatformEarningFeeSource.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PlatformEarningFeeSource is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
