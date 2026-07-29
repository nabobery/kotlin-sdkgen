package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gpg-key/properties/emails/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gpg-key/properties/emails/items
 */
@Serializable(with = InlineGpgKeyEmailsItemX35db4821.Serializer::class)
public class InlineGpgKeyEmailsItemX35db4821(
  public val email: String? = null,
  public val verified: Boolean? = null,
) {
  public class Builder {
    public var email: String? = null

    public var verified: Boolean? = null

    public fun build(): InlineGpgKeyEmailsItemX35db4821 = InlineGpgKeyEmailsItemX35db4821(
      email = email,
      verified = verified,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGpgKeyEmailsItemX35db4821 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGpgKeyEmailsItemX35db4821> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGpgKeyEmailsItemX35db4821 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGpgKeyEmailsItemX35db4821")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGpgKeyEmailsItemX35db4821 must be a JSON object")
      return InlineGpgKeyEmailsItemX35db4821(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        verified = rawObject["verified"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGpgKeyEmailsItemX35db4821) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGpgKeyEmailsItemX35db4821")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.verified?.let { put("verified", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGpgKeyEmailsItemX35db4821(block: InlineGpgKeyEmailsItemX35db4821.Builder.() -> Unit): InlineGpgKeyEmailsItemX35db4821 = InlineGpgKeyEmailsItemX35db4821.build(block)
