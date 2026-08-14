package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913.Serializer::class)
public class InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913(
  /**
   * Details about network-specific tracking information.
   */
  public val trackingDetails: InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var trackingDetailsValue:
        InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d? = null

    public var trackingDetails:
        InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d
      get() = requireNotNull(trackingDetailsValue) { "trackingDetails is required" }
      set(`value`) {
        trackingDetailsValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 {
      check(trackingDetailsValue != null) { "trackingDetails is required" }
      return InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913(
        trackingDetails = trackingDetails,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 must be a JSON object")
      val trackingDetails = json.decodeRequired<InlineV1TestHelpersTreasura193PostRequestFormTrackingDetailsXab87068d>(rawObject, "tracking_details")
      return InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913(
        trackingDetails = trackingDetails,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("tracking_details", json.encodeToJsonElement(value.trackingDetails))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913(block: InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913.Builder.() -> Unit): InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 = InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersTreasuryOutboundPaymentsPostRequestFormXdca90913 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
