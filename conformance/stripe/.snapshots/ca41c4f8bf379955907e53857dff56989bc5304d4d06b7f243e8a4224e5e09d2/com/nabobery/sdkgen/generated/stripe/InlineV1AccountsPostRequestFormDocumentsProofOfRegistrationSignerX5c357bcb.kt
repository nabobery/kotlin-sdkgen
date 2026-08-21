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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/proof_of_registration/properties/signer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/proof_of_registration/properties/signer
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb(
  public val person: String? = null,
) {
  public class Builder {
    public var person: String? = null

    public fun build(): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb(
      person = person,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb must be a JSON object")
      return InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb(
        person = rawObject["person"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.person?.let { put("person", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb(block: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb.Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb.build(block)
