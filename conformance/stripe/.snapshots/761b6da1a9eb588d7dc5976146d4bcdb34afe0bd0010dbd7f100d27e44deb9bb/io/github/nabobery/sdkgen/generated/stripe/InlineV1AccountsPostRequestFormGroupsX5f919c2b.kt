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
 * A hash of account group type to tokens. These are account groups this account should be added to.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/groups
 */
@Serializable(with = InlineV1AccountsPostRequestFormGroupsX5f919c2b.Serializer::class)
public class InlineV1AccountsPostRequestFormGroupsX5f919c2b(
  public val paymentsPricing: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5? = null,
) {
  public class Builder {
    public var paymentsPricing: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5? =
        null

    public fun build(): InlineV1AccountsPostRequestFormGroupsX5f919c2b = InlineV1AccountsPostRequestFormGroupsX5f919c2b(
      paymentsPricing = paymentsPricing,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormGroupsX5f919c2b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormGroupsX5f919c2b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormGroupsX5f919c2b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormGroupsX5f919c2b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormGroupsX5f919c2b must be a JSON object")
      return InlineV1AccountsPostRequestFormGroupsX5f919c2b(
        paymentsPricing = rawObject["payments_pricing"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormGroupsX5f919c2b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormGroupsX5f919c2b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentsPricing?.let { put("payments_pricing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormGroupsX5f919c2b(block: InlineV1AccountsPostRequestFormGroupsX5f919c2b.Builder.() -> Unit): InlineV1AccountsPostRequestFormGroupsX5f919c2b = InlineV1AccountsPostRequestFormGroupsX5f919c2b.build(block)
