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
import kotlinx.serialization.json.put

/**
 * Details provided about the user being verified. These details might be shown to the user.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/provided_details
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0(
  public val email: String? = null,
  public val phone: String? = null,
) {
  public class Builder {
    public var email: String? = null

    public var phone: String? = null

    public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0 = InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0(
      email = email,
      phone = phone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0 must be a JSON object")
      return InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.phone?.let { put("phone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0(block: InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0.Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0 = InlineV1IdentityVerificationSessionsPostRequestFormProvidedDetailsX4215b0d0.build(block)
