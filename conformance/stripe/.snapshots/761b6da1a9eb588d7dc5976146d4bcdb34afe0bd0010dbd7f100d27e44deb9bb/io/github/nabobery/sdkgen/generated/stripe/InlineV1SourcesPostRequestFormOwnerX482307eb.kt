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
 * Information about the owner of the payment instrument that may be used or required by particular source types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1sources~1{source}/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/owner
 */
@Serializable(with = InlineV1SourcesPostRequestFormOwnerX482307eb.Serializer::class)
public class InlineV1SourcesPostRequestFormOwnerX482307eb(
  public val address: InlineV1SourcesPostRequestFormOwnerAddressX3d8b0cb9? = null,
  public val email: String? = null,
  public val name: String? = null,
  public val phone: String? = null,
) {
  public class Builder {
    public var address: InlineV1SourcesPostRequestFormOwnerAddressX3d8b0cb9? = null

    public var email: String? = null

    public var name: String? = null

    public var phone: String? = null

    public fun build(): InlineV1SourcesPostRequestFormOwnerX482307eb = InlineV1SourcesPostRequestFormOwnerX482307eb(
      address = address,
      email = email,
      name = name,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SourcesPostRequestFormOwnerX482307eb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SourcesPostRequestFormOwnerX482307eb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SourcesPostRequestFormOwnerX482307eb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SourcesPostRequestFormOwnerX482307eb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SourcesPostRequestFormOwnerX482307eb must be a JSON object")
      return InlineV1SourcesPostRequestFormOwnerX482307eb(
        address = rawObject["address"]?.let { json.decodeFromJsonElement<InlineV1SourcesPostRequestFormOwnerAddressX3d8b0cb9>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SourcesPostRequestFormOwnerX482307eb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SourcesPostRequestFormOwnerX482307eb")
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

public fun inlineV1SourcesPostRequestFormOwnerX482307eb(block: InlineV1SourcesPostRequestFormOwnerX482307eb.Builder.() -> Unit): InlineV1SourcesPostRequestFormOwnerX482307eb = InlineV1SourcesPostRequestFormOwnerX482307eb.build(block)
