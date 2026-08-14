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
 * A set of options for the session’s verification checks.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492(
  public val document:
      InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c? = null,
) {
  public class Builder {
    public var document:
        InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c? = null

    public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492 = InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492(
      document = document,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492 must be a JSON object")
      return InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492(
        document = rawObject["document"]?.let { json.decodeFromJsonElement<InlineV1IdentityVerificationSessionsPostRequestFormOptionsDocumentX1c0e753c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.document?.let { put("document", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492(block: InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492.Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492 = InlineV1IdentityVerificationSessionsPostRequestFormOptionsX1126d492.build(block)
