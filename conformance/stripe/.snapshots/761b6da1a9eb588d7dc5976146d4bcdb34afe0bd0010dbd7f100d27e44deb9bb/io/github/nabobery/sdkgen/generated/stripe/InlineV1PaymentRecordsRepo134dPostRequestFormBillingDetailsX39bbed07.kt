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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/payment_method_details/properties/billing_details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1report_payment/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/payment_method_details/properties/billing_details
 */
@Serializable(with = InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07.Serializer::class)
public class InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07(
  public val address: InlineV1PaymentRecordsRepo134dPostRequestFormAddressX12a2d4e1? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
) {
  public class Builder {
    public var address: InlineV1PaymentRecordsRepo134dPostRequestFormAddressX12a2d4e1? = null

    public var email: String? = null

    public var name: String? = null

    public var phone: String? = null

    public fun build(): InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07 = InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07(
      address = address,
      email = email,
      name = name,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07 must be a JSON object")
      return InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1PaymentRecordsRepo134dPostRequestFormAddressX12a2d4e1>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07(block: InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07.Builder.() -> Unit): InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07 = InlineV1PaymentRecordsRepo134dPostRequestFormBillingDetailsX39bbed07.build(block)
