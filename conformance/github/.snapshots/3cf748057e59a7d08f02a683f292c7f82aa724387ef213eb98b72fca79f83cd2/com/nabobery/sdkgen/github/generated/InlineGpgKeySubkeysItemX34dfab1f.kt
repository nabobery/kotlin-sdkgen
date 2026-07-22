package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gpg-key/properties/subkeys/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gpg-key/properties/subkeys/items
 */
@Serializable(with = InlineGpgKeySubkeysItemX34dfab1f.Serializer::class)
public class InlineGpgKeySubkeysItemX34dfab1f(
  public val canCertify: Boolean? = null,
  public val canEncryptComms: Boolean? = null,
  public val canEncryptStorage: Boolean? = null,
  public val canSign: Boolean? = null,
  public val createdAt: String? = null,
  public val emails: List<InlineGpgKeySubkeysItemEmailsItemX74c93dc0>? = null,
  public val expiresAt: String? = null,
  public val id: Long? = null,
  public val keyId: String? = null,
  public val primaryKeyId: Int? = null,
  public val publicKey: String? = null,
  public val rawKey: String? = null,
  public val revoked: Boolean? = null,
  public val subkeys: List<JsonElement>? = null,
) {
  public class Builder {
    public var canCertify: Boolean? = null

    public var canEncryptComms: Boolean? = null

    public var canEncryptStorage: Boolean? = null

    public var canSign: Boolean? = null

    public var createdAt: String? = null

    public var emails: List<InlineGpgKeySubkeysItemEmailsItemX74c93dc0>? = null

    public var expiresAt: String? = null

    public var id: Long? = null

    public var keyId: String? = null

    public var primaryKeyId: Int? = null

    public var publicKey: String? = null

    public var rawKey: String? = null

    public var revoked: Boolean? = null

    public var subkeys: List<JsonElement>? = null

    public fun build(): InlineGpgKeySubkeysItemX34dfab1f = InlineGpgKeySubkeysItemX34dfab1f(
      canCertify = canCertify,
      canEncryptComms = canEncryptComms,
      canEncryptStorage = canEncryptStorage,
      canSign = canSign,
      createdAt = createdAt,
      emails = emails,
      expiresAt = expiresAt,
      id = id,
      keyId = keyId,
      primaryKeyId = primaryKeyId,
      publicKey = publicKey,
      rawKey = rawKey,
      revoked = revoked,
      subkeys = subkeys,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGpgKeySubkeysItemX34dfab1f = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGpgKeySubkeysItemX34dfab1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGpgKeySubkeysItemX34dfab1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGpgKeySubkeysItemX34dfab1f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGpgKeySubkeysItemX34dfab1f must be a JSON object")
      return InlineGpgKeySubkeysItemX34dfab1f(
        canCertify = rawObject["can_certify"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        canEncryptComms = rawObject["can_encrypt_comms"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        canEncryptStorage = rawObject["can_encrypt_storage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        canSign = rawObject["can_sign"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        emails = rawObject["emails"]?.let { json.decodeFromJsonElement<List<InlineGpgKeySubkeysItemEmailsItemX74c93dc0>>(it) },
        expiresAt = rawObject["expires_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Long>(it) },
        keyId = rawObject["key_id"]?.let { json.decodeFromJsonElement<String>(it) },
        primaryKeyId = rawObject["primary_key_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        publicKey = rawObject["public_key"]?.let { json.decodeFromJsonElement<String>(it) },
        rawKey = rawObject["raw_key"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        revoked = rawObject["revoked"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        subkeys = rawObject["subkeys"]?.let { json.decodeFromJsonElement<List<JsonElement>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGpgKeySubkeysItemX34dfab1f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGpgKeySubkeysItemX34dfab1f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.canCertify?.let { put("can_certify", json.encodeToJsonElement(it)) }
        value.canEncryptComms?.let { put("can_encrypt_comms", json.encodeToJsonElement(it)) }
        value.canEncryptStorage?.let { put("can_encrypt_storage", json.encodeToJsonElement(it)) }
        value.canSign?.let { put("can_sign", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.emails?.let { put("emails", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.keyId?.let { put("key_id", it) }
        value.primaryKeyId?.let { put("primary_key_id", json.encodeToJsonElement(it)) }
        value.publicKey?.let { put("public_key", it) }
        value.rawKey?.let { put("raw_key", it) }
        value.revoked?.let { put("revoked", json.encodeToJsonElement(it)) }
        value.subkeys?.let { put("subkeys", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGpgKeySubkeysItemX34dfab1f(block: InlineGpgKeySubkeysItemX34dfab1f.Builder.() -> Unit): InlineGpgKeySubkeysItemX34dfab1f = InlineGpgKeySubkeysItemX34dfab1f.build(block)
