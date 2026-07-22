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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A unique encryption key
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gpg-key
 */
@Serializable(with = GpgKey.Serializer::class)
public class GpgKey internal constructor(
  public val canCertify: Boolean,
  public val canEncryptComms: Boolean,
  public val canEncryptStorage: Boolean,
  public val canSign: Boolean,
  public val createdAt: String,
  emails: List<InlineGpgKeyEmailsItemX35db4821>,
  public val expiresAt: String?,
  public val id: Long,
  public val keyId: String,
  public val primaryKeyId: Int?,
  public val publicKey: String,
  public val rawKey: String?,
  public val revoked: Boolean,
  subkeys: List<InlineGpgKeySubkeysItemX34dfab1f>,
  private val nameState: FieldState<String?>,
) {
  public val emails: List<InlineGpgKeyEmailsItemX35db4821> = emails.toList()

  public val subkeys: List<InlineGpgKeySubkeysItemX34dfab1f> = subkeys.toList()

  public val name: String?
    get() = nameState.valueOrNull()

  public constructor(
    canCertify: Boolean,
    canEncryptComms: Boolean,
    canEncryptStorage: Boolean,
    canSign: Boolean,
    createdAt: String,
    emails: List<InlineGpgKeyEmailsItemX35db4821>,
    expiresAt: String?,
    id: Long,
    keyId: String,
    primaryKeyId: Int?,
    publicKey: String,
    rawKey: String?,
    revoked: Boolean,
    subkeys: List<InlineGpgKeySubkeysItemX34dfab1f>,
  ) : this(canCertify = canCertify,
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
  nameState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  public class Builder {
    private var canCertifyValue: Boolean? = null

    public var canCertify: Boolean
      get() = requireNotNull(canCertifyValue) { "canCertify is required" }
      set(`value`) {
        canCertifyValue = value
      }

    private var canEncryptCommsValue: Boolean? = null

    public var canEncryptComms: Boolean
      get() = requireNotNull(canEncryptCommsValue) { "canEncryptComms is required" }
      set(`value`) {
        canEncryptCommsValue = value
      }

    private var canEncryptStorageValue: Boolean? = null

    public var canEncryptStorage: Boolean
      get() = requireNotNull(canEncryptStorageValue) { "canEncryptStorage is required" }
      set(`value`) {
        canEncryptStorageValue = value
      }

    private var canSignValue: Boolean? = null

    public var canSign: Boolean
      get() = requireNotNull(canSignValue) { "canSign is required" }
      set(`value`) {
        canSignValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var emailsValue: List<InlineGpgKeyEmailsItemX35db4821>? = null

    public var emails: List<InlineGpgKeyEmailsItemX35db4821>
      get() = requireNotNull(emailsValue) { "emails is required" }
      set(`value`) {
        emailsValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var keyIdValue: String? = null

    public var keyId: String
      get() = requireNotNull(keyIdValue) { "keyId is required" }
      set(`value`) {
        keyIdValue = value
      }

    private var publicKeyValue: String? = null

    public var publicKey: String
      get() = requireNotNull(publicKeyValue) { "publicKey is required" }
      set(`value`) {
        publicKeyValue = value
      }

    private var revokedValue: Boolean? = null

    public var revoked: Boolean
      get() = requireNotNull(revokedValue) { "revoked is required" }
      set(`value`) {
        revokedValue = value
      }

    private var subkeysValue: List<InlineGpgKeySubkeysItemX34dfab1f>? = null

    public var subkeys: List<InlineGpgKeySubkeysItemX34dfab1f>
      get() = requireNotNull(subkeysValue) { "subkeys is required" }
      set(`value`) {
        subkeysValue = value
      }

    private var expiresAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var expiresAt: String?
      get() = expiresAtState.valueOrNull()
      set(`value`) {
        expiresAtState = value.toNullableFieldState()
      }

    private var primaryKeyIdState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var primaryKeyId: Int?
      get() = primaryKeyIdState.valueOrNull()
      set(`value`) {
        primaryKeyIdState = value.toNullableFieldState()
      }

    private var rawKeyState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var rawKey: String?
      get() = rawKeyState.valueOrNull()
      set(`value`) {
        rawKeyState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        nameState = value.toNullableFieldState()
      }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    public fun build(): GpgKey {
      check(canCertifyValue != null) { "canCertify is required" }
      check(canEncryptCommsValue != null) { "canEncryptComms is required" }
      check(canEncryptStorageValue != null) { "canEncryptStorage is required" }
      check(canSignValue != null) { "canSign is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(emailsValue != null) { "emails is required" }
      check(idValue != null) { "id is required" }
      check(keyIdValue != null) { "keyId is required" }
      check(publicKeyValue != null) { "publicKey is required" }
      check(revokedValue != null) { "revoked is required" }
      check(subkeysValue != null) { "subkeys is required" }
      check(expiresAtState !== FieldState.Absent) { "expiresAt is required, even when null" }
      check(primaryKeyIdState !== FieldState.Absent) { "primaryKeyId is required, even when null" }
      check(rawKeyState !== FieldState.Absent) { "rawKey is required, even when null" }
      return GpgKey(
        canCertify = canCertify,
        canEncryptComms = canEncryptComms,
        canEncryptStorage = canEncryptStorage,
        canSign = canSign,
        createdAt = createdAt,
        emails = emails,
        expiresAt = expiresAtState.valueOrNull(),
        id = id,
        keyId = keyId,
        primaryKeyId = primaryKeyIdState.valueOrNull(),
        publicKey = publicKey,
        rawKey = rawKeyState.valueOrNull(),
        revoked = revoked,
        subkeys = subkeys,
        nameState = nameState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GpgKey = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GpgKey> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GpgKey {
      val jsonDecoder = decoder.requireJsonDecoder("GpgKey")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GpgKey must be a JSON object")
      val canCertify = json.decodeRequired<Boolean>(rawObject, "can_certify")
      val canEncryptComms = json.decodeRequired<Boolean>(rawObject, "can_encrypt_comms")
      val canEncryptStorage = json.decodeRequired<Boolean>(rawObject, "can_encrypt_storage")
      val canSign = json.decodeRequired<Boolean>(rawObject, "can_sign")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val emails = json.decodeRequired<List<InlineGpgKeyEmailsItemX35db4821>>(rawObject, "emails")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val keyId = json.decodeRequired<String>(rawObject, "key_id")
      val publicKey = json.decodeRequired<String>(rawObject, "public_key")
      val revoked = json.decodeRequired<Boolean>(rawObject, "revoked")
      val subkeys = json.decodeRequired<List<InlineGpgKeySubkeysItemX34dfab1f>>(rawObject, "subkeys")
      if (!rawObject.containsKey("expires_at")) {
        throw SerializationException("GpgKey is missing required property 'expires_at'")
      }
      val expiresAt = rawObject["expires_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("primary_key_id")) {
        throw SerializationException("GpgKey is missing required property 'primary_key_id'")
      }
      val primaryKeyId = rawObject["primary_key_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("raw_key")) {
        throw SerializationException("GpgKey is missing required property 'raw_key'")
      }
      val rawKey = rawObject["raw_key"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return GpgKey(
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
        nameState = json.decodeOptional(rawObject, "name", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: GpgKey) {
      val jsonEncoder = encoder.requireJsonEncoder("GpgKey")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("can_certify", json.encodeToJsonElement(value.canCertify))
        put("can_encrypt_comms", json.encodeToJsonElement(value.canEncryptComms))
        put("can_encrypt_storage", json.encodeToJsonElement(value.canEncryptStorage))
        put("can_sign", json.encodeToJsonElement(value.canSign))
        put("created_at", value.createdAt)
        put("emails", json.encodeToJsonElement(value.emails))
        put("expires_at", value.expiresAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("key_id", value.keyId)
        put("primary_key_id", value.primaryKeyId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("public_key", value.publicKey)
        put("raw_key", value.rawKey?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("revoked", json.encodeToJsonElement(value.revoked))
        put("subkeys", json.encodeToJsonElement(value.subkeys))
        putState("name", value.nameState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gpgKey(block: GpgKey.Builder.() -> Unit): GpgKey = GpgKey.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GpgKey is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("GpgKey property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
