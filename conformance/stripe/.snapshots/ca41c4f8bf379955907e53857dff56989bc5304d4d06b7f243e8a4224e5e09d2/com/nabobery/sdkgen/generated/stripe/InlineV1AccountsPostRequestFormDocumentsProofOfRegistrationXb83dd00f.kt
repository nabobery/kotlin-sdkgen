package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/proof_of_registration.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/documents/properties/proof_of_registration
 */
@Serializable(with = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f.Serializer::class)
public class InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f(
  files: List<String>? = null,
  public val signer:
      InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb? = null,
) {
  public val files: List<String>? = files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var filesValue: List<String>? = null

    public var files: List<String>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var signer: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb? =
        null

    public fun build(): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f(
      files = files,
      signer = signer,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f must be a JSON object")
      return InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f(
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        signer = rawObject["signer"]?.let { json.decodeFromJsonElement<InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationSignerX5c357bcb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
        value.signer?.let { put("signer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f(block: InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f.Builder.() -> Unit): InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f = InlineV1AccountsPostRequestFormDocumentsProofOfRegistrationXb83dd00f.build(block)
