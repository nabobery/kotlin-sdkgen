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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/customer_details/properties/tax
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93(
  public val ipAddress:
      InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac? = null,
) {
  public class Builder {
    public var ipAddress:
        InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac? = null

    public fun build(): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93 = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93(
      ipAddress = ipAddress,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93 must be a JSON object")
      return InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93(
        ipAddress = rawObject["ip_address"]?.let { json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxIpAddressX62ffa0ac>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ipAddress?.let { put("ip_address", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93(block: InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93.Builder.() -> Unit): InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93 = InlineV1InvoicesCreatePreviewPostRequestFormCustomerDetailsTaxX88055a93.build(block)
