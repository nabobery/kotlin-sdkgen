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
 * Information about the owner of the payment instrument that may be used or required by particular source types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources/post/requestBody/content/application~1x-www-form-urlencoded/schema/
 * properties/owner
 */
@Serializable(with = InlineV1SourcesPostRequestFormOwnerXced83c15.Serializer::class)
public class InlineV1SourcesPostRequestFormOwnerXced83c15(
  public val address: InlineV1SourcesPostRequestFormOwnerAddressX330f3c87? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
) {
  public class Builder {
    public var address: InlineV1SourcesPostRequestFormOwnerAddressX330f3c87? = null

    public var email: String? = null

    public var name: String? = null

    public var phone: String? = null

    public fun build(): InlineV1SourcesPostRequestFormOwnerXced83c15 = InlineV1SourcesPostRequestFormOwnerXced83c15(
      address = address,
      email = email,
      name = name,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormOwnerXced83c15 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormOwnerXced83c15> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormOwnerXced83c15 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormOwnerXced83c15")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormOwnerXced83c15 must be a JSON object")
      return InlineV1SourcesPostRequestFormOwnerXced83c15(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormOwnerAddressX330f3c87>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormOwnerXced83c15) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormOwnerXced83c15")
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

public fun inlineV1SourcesPostRequestFormOwnerXced83c15(block: InlineV1SourcesPostRequestFormOwnerXced83c15.Builder.() -> Unit): InlineV1SourcesPostRequestFormOwnerXced83c15 = InlineV1SourcesPostRequestFormOwnerXced83c15.build(block)
