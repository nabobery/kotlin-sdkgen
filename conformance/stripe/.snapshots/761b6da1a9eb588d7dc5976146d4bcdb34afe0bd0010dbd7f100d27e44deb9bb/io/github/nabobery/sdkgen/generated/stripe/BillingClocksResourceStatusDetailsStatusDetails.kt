package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_clocks_resource_status_details_status_details
 */
@Serializable(with = BillingClocksResourceStatusDetailsStatusDetails.Serializer::class)
public class BillingClocksResourceStatusDetailsStatusDetails(
  public val advancing: BillingClocksResourceStatusDetailsAdvancingStatusDetails? = null,
) {
  public class Builder {
    public var advancing: BillingClocksResourceStatusDetailsAdvancingStatusDetails? = null

    public fun build(): BillingClocksResourceStatusDetailsStatusDetails = BillingClocksResourceStatusDetailsStatusDetails(
      advancing = advancing,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): BillingClocksResourceStatusDetailsStatusDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<BillingClocksResourceStatusDetailsStatusDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): BillingClocksResourceStatusDetailsStatusDetails {
      val jsonDecoder = decoder.requireJsonDecoder("BillingClocksResourceStatusDetailsStatusDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("BillingClocksResourceStatusDetailsStatusDetails must be a JSON object")
      return BillingClocksResourceStatusDetailsStatusDetails(
        advancing = rawObject["advancing"]?.let { json.decodeFromJsonElement<BillingClocksResourceStatusDetailsAdvancingStatusDetails>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: BillingClocksResourceStatusDetailsStatusDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("BillingClocksResourceStatusDetailsStatusDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.advancing?.let { put("advancing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun billingClocksResourceStatusDetailsStatusDetails(block: BillingClocksResourceStatusDetailsStatusDetails.Builder.() -> Unit): BillingClocksResourceStatusDetailsStatusDetails = BillingClocksResourceStatusDetailsStatusDetails.build(block)
