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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/groups
 */
@Serializable(with = InlineV1AccountsPostRequestFormGroupsX165c6212.Serializer::class)
public class InlineV1AccountsPostRequestFormGroupsX165c6212(
  public val paymentsPricing: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e? = null,
) {
  public class Builder {
    public var paymentsPricing: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e? =
        null

    public fun build(): InlineV1AccountsPostRequestFormGroupsX165c6212 = InlineV1AccountsPostRequestFormGroupsX165c6212(
      paymentsPricing = paymentsPricing,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormGroupsX165c6212 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormGroupsX165c6212> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormGroupsX165c6212 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormGroupsX165c6212")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormGroupsX165c6212 must be a JSON object")
      return InlineV1AccountsPostRequestFormGroupsX165c6212(
        paymentsPricing = rawObject["payments_pricing"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormGroupsX165c6212) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormGroupsX165c6212")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.paymentsPricing?.let { put("payments_pricing", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormGroupsX165c6212(block: InlineV1AccountsPostRequestFormGroupsX165c6212.Builder.() -> Unit): InlineV1AccountsPostRequestFormGroupsX165c6212 = InlineV1AccountsPostRequestFormGroupsX165c6212.build(block)
