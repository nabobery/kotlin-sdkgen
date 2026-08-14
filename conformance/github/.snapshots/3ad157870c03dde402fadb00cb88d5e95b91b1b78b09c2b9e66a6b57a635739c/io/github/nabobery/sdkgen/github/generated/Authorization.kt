package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * The authorization for an OAuth app, GitHub App, or a Personal Access Token.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/authorization
 */
@Serializable(with = Authorization.Serializer::class)
public class Authorization internal constructor(
  public val app: InlineAuthorizationAppX219651f5,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val expiresAt: String?,
  public val fingerprint: String?,
  public val hashedToken: String?,
  public val id: Long,
  public val note: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val noteUrl: String?,
  scopes: List<String>?,
  public val token: String,
  public val tokenLastEight: String?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val installationState: FieldState<NullableScopedInstallation?>,
  private val userState: FieldState<NullableSimpleUser?>,
) {
  /**
   * A list of scopes that this authorization is in.
   */
  public val scopes: List<String>? = scopes?.let { collection0 -> collection0.toList() }

  public val installation: NullableScopedInstallation?
    get() = installationState.valueOrNull()

  public val user: NullableSimpleUser?
    get() = userState.valueOrNull()

  public constructor(
    app: InlineAuthorizationAppX219651f5,
    createdAt: String,
    expiresAt: String?,
    fingerprint: String?,
    hashedToken: String?,
    id: Long,
    note: String?,
    noteUrl: String?,
    scopes: List<String>?,
    token: String,
    tokenLastEight: String?,
    updatedAt: String,
    url: String,
  ) : this(app = app,
  createdAt = createdAt,
  expiresAt = expiresAt,
  fingerprint = fingerprint,
  hashedToken = hashedToken,
  id = id,
  note = note,
  noteUrl = noteUrl,
  scopes = scopes,
  token = token,
  tokenLastEight = tokenLastEight,
  updatedAt = updatedAt,
  url = url,
  installationState = FieldState.Absent,
  userState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `installation`.
   */
  public fun installationPresence(): FieldPresence = installationState.presence

  /**
   * Returns the wire presence of `user`.
   */
  public fun userPresence(): FieldPresence = userState.presence

  public class Builder {
    private var appValue: InlineAuthorizationAppX219651f5? = null

    public var app: InlineAuthorizationAppX219651f5
      get() = requireNotNull(appValue) { "app is required" }
      set(`value`) {
        appValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var expiresAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var expiresAt: String?
      get() = expiresAtState.valueOrNull()
      set(`value`) {
        expiresAtState = value.toNullableFieldState()
      }

    private var fingerprintState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var fingerprint: String?
      get() = fingerprintState.valueOrNull()
      set(`value`) {
        fingerprintState = value.toNullableFieldState()
      }

    private var hashedTokenState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var hashedToken: String?
      get() = hashedTokenState.valueOrNull()
      set(`value`) {
        hashedTokenState = value.toNullableFieldState()
      }

    private var noteState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var note: String?
      get() = noteState.valueOrNull()
      set(`value`) {
        noteState = value.toNullableFieldState()
      }

    private var noteUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var noteUrl: String?
      get() = noteUrlState.valueOrNull()
      set(`value`) {
        noteUrlState = value.toNullableFieldState()
      }

    private var scopesState: FieldState<List<String>?> = FieldState.Absent

    /**
     * A list of scopes that this authorization is in.
     * Required nullable field; assigning `null` records present-null.
     */
    public var scopes: List<String>?
      get() = scopesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        scopesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var tokenLastEightState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var tokenLastEight: String?
      get() = tokenLastEightState.valueOrNull()
      set(`value`) {
        tokenLastEightState = value.toNullableFieldState()
      }

    private var installationState: FieldState<NullableScopedInstallation?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var installation: NullableScopedInstallation?
      get() = installationState.valueOrNull()
      set(`value`) {
        installationState = value.toNullableFieldState()
      }

    private var userState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var user: NullableSimpleUser?
      get() = userState.valueOrNull()
      set(`value`) {
        userState = value.toNullableFieldState()
      }

    /**
     * Omits `installation` from serialized output.
     */
    public fun unsetInstallation() {
      installationState = FieldState.Absent
    }

    /**
     * Omits `user` from serialized output.
     */
    public fun unsetUser() {
      userState = FieldState.Absent
    }

    public fun build(): Authorization {
      check(appValue != null) { "app is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(tokenValue != null) { "token is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(expiresAtState !== FieldState.Absent) { "expiresAt is required, even when null" }
      check(fingerprintState !== FieldState.Absent) { "fingerprint is required, even when null" }
      check(hashedTokenState !== FieldState.Absent) { "hashedToken is required, even when null" }
      check(noteState !== FieldState.Absent) { "note is required, even when null" }
      check(noteUrlState !== FieldState.Absent) { "noteUrl is required, even when null" }
      check(scopesState !== FieldState.Absent) { "scopes is required, even when null" }
      check(tokenLastEightState !== FieldState.Absent) { "tokenLastEight is required, even when null" }
      return Authorization(
        app = app,
        createdAt = createdAt,
        expiresAt = expiresAtState.valueOrNull(),
        fingerprint = fingerprintState.valueOrNull(),
        hashedToken = hashedTokenState.valueOrNull(),
        id = id,
        note = noteState.valueOrNull(),
        noteUrl = noteUrlState.valueOrNull(),
        scopes = scopesState.valueOrNull(),
        token = token,
        tokenLastEight = tokenLastEightState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        installationState = installationState,
        userState = userState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Authorization = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Authorization> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Authorization {
      val jsonDecoder = decoder.requireJsonDecoder("Authorization")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Authorization must be a JSON object")
      val app = json.decodeRequired<InlineAuthorizationAppX219651f5>(rawObject, "app")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val token = json.decodeRequired<String>(rawObject, "token")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("expires_at")) {
        throw SerializationException("Authorization is missing required property 'expires_at'")
      }
      val expiresAt = rawObject["expires_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("fingerprint")) {
        throw SerializationException("Authorization is missing required property 'fingerprint'")
      }
      val fingerprint = rawObject["fingerprint"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("hashed_token")) {
        throw SerializationException("Authorization is missing required property 'hashed_token'")
      }
      val hashedToken = rawObject["hashed_token"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("note")) {
        throw SerializationException("Authorization is missing required property 'note'")
      }
      val note = rawObject["note"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("note_url")) {
        throw SerializationException("Authorization is missing required property 'note_url'")
      }
      val noteUrl = rawObject["note_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("scopes")) {
        throw SerializationException("Authorization is missing required property 'scopes'")
      }
      val scopes = rawObject["scopes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("token_last_eight")) {
        throw SerializationException("Authorization is missing required property 'token_last_eight'")
      }
      val tokenLastEight = rawObject["token_last_eight"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Authorization(
        app = app,
        createdAt = createdAt,
        expiresAt = expiresAt,
        fingerprint = fingerprint,
        hashedToken = hashedToken,
        id = id,
        note = note,
        noteUrl = noteUrl,
        scopes = scopes,
        token = token,
        tokenLastEight = tokenLastEight,
        updatedAt = updatedAt,
        url = url,
        installationState = json.decodeOptional(rawObject, "installation", nullable = true),
        userState = json.decodeOptional(rawObject, "user", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Authorization) {
      val jsonEncoder = encoder.requireJsonEncoder("Authorization")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app", json.encodeToJsonElement(value.app))
        put("created_at", value.createdAt)
        put("expires_at", value.expiresAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("fingerprint", value.fingerprint?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("hashed_token", value.hashedToken?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("note", value.note?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("note_url", value.noteUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("scopes", value.scopes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("token", value.token)
        put("token_last_eight", value.tokenLastEight?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("installation", value.installationState, json::encodeToJsonElement)
        putState("user", value.userState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun authorization(block: Authorization.Builder.() -> Unit): Authorization = Authorization.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Authorization is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Authorization property '" + name + "' is not nullable")
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
