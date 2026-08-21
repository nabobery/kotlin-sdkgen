package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Tokens referencing a Person resource and its associated account.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/related_person
 */
@Serializable(with = InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0.Serializer::class)
public class InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0(
  public val account: String,
  public val person: String,
) {
  public class Builder {
    private var accountValue: String? = null

    public var account: String
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var personValue: String? = null

    public var person: String
      get() = requireNotNull(personValue) { "person is required" }
      set(`value`) {
        personValue = value
      }

    public fun build(): InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0 {
      check(accountValue != null) { "account is required" }
      check(personValue != null) { "person is required" }
      return InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0(
        account = account,
        person = person,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0 must be a JSON object")
      val account = json.decodeRequired<String>(rawObject, "account")
      val person = json.decodeRequired<String>(rawObject, "person")
      return InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0(
        account = account,
        person = person,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", value.account)
        put("person", value.person)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0(block: InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0.Builder.() -> Unit): InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0 = InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IdentityVerificationSessionsPostRequestFormRelatedPersonX361bb9e0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
