package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/owner.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1cards~1{id}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/owner
 */
@Serializable(with = InlineV1CustomersCardsPostRequestFormOwnerX29404a7d.Serializer::class)
public class InlineV1CustomersCardsPostRequestFormOwnerX29404a7d(
  public val address: InlineV1CustomersCardsPostRequestFormOwnerAddressXe107f8b9? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
) {
  public class Builder {
    public var address: InlineV1CustomersCardsPostRequestFormOwnerAddressXe107f8b9? = null

    public var email: String? = null

    public var name: String? = null

    public var phone: String? = null

    public fun build(): InlineV1CustomersCardsPostRequestFormOwnerX29404a7d = InlineV1CustomersCardsPostRequestFormOwnerX29404a7d(
      address = address,
      email = email,
      name = name,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomersCardsPostRequestFormOwnerX29404a7d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomersCardsPostRequestFormOwnerX29404a7d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersCardsPostRequestFormOwnerX29404a7d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersCardsPostRequestFormOwnerX29404a7d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomersCardsPostRequestFormOwnerX29404a7d must be a JSON object")
      return InlineV1CustomersCardsPostRequestFormOwnerX29404a7d(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1CustomersCardsPostRequestFormOwnerAddressXe107f8b9>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersCardsPostRequestFormOwnerX29404a7d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomersCardsPostRequestFormOwnerX29404a7d")
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

public fun inlineV1CustomersCardsPostRequestFormOwnerX29404a7d(block: InlineV1CustomersCardsPostRequestFormOwnerX29404a7d.Builder.() -> Unit): InlineV1CustomersCardsPostRequestFormOwnerX29404a7d = InlineV1CustomersCardsPostRequestFormOwnerX29404a7d.build(block)
