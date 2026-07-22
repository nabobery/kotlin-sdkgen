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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/gpg-key/properties/subkeys/items/properties/emails/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gpg-key/properties/subkeys/items/properties/emails/items
 */
@Serializable(with = InlineGpgKeySubkeysItemEmailsItemX74c93dc0.Serializer::class)
public class InlineGpgKeySubkeysItemEmailsItemX74c93dc0(
  public val email: String? = null,
  public val verified: Boolean? = null,
) {
  public class Builder {
    public var email: String? = null

    public var verified: Boolean? = null

    public fun build(): InlineGpgKeySubkeysItemEmailsItemX74c93dc0 = InlineGpgKeySubkeysItemEmailsItemX74c93dc0(
      email = email,
      verified = verified,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGpgKeySubkeysItemEmailsItemX74c93dc0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGpgKeySubkeysItemEmailsItemX74c93dc0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGpgKeySubkeysItemEmailsItemX74c93dc0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGpgKeySubkeysItemEmailsItemX74c93dc0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGpgKeySubkeysItemEmailsItemX74c93dc0 must be a JSON object")
      return InlineGpgKeySubkeysItemEmailsItemX74c93dc0(
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        verified = rawObject["verified"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGpgKeySubkeysItemEmailsItemX74c93dc0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGpgKeySubkeysItemEmailsItemX74c93dc0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.email?.let { put("email", it) }
        value.verified?.let { put("verified", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGpgKeySubkeysItemEmailsItemX74c93dc0(block: InlineGpgKeySubkeysItemEmailsItemX74c93dc0.Builder.() -> Unit): InlineGpgKeySubkeysItemEmailsItemX74c93dc0 = InlineGpgKeySubkeysItemEmailsItemX74c93dc0.build(block)
