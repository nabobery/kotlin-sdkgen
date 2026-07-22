package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/package_files/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-published/properties/package/properties/package_vers
 * ion/properties/package_files/items
 */
@Serializable(with = InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219.Serializer::class)
public class InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219(
  public val contentType: String,
  public val createdAt: String,
  public val downloadUrl: String,
  public val id: Int,
  public val md5: String?,
  public val name: String,
  public val sha1: String?,
  public val sha256: String?,
  public val size: Int,
  public val state: String?,
  public val updatedAt: String,
) {
  public class Builder {
    private var contentTypeValue: String? = null

    public var contentType: String
      get() = requireNotNull(contentTypeValue) { "contentType is required" }
      set(`value`) {
        contentTypeValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var downloadUrlValue: String? = null

    public var downloadUrl: String
      get() = requireNotNull(downloadUrlValue) { "downloadUrl is required" }
      set(`value`) {
        downloadUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var md5State: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var md5: String?
      get() = md5State.valueOrNull()
      set(`value`) {
        md5State = value.toNullableFieldState()
      }

    private var sha1State: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sha1: String?
      get() = sha1State.valueOrNull()
      set(`value`) {
        sha1State = value.toNullableFieldState()
      }

    private var sha256State: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var sha256: String?
      get() = sha256State.valueOrNull()
      set(`value`) {
        sha256State = value.toNullableFieldState()
      }

    private var stateState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var state: String?
      get() = stateState.valueOrNull()
      set(`value`) {
        stateState = value.toNullableFieldState()
      }

    public fun build(): InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 {
      check(contentTypeValue != null) { "contentType is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(downloadUrlValue != null) { "downloadUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(sizeValue != null) { "size is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(md5State !== FieldState.Absent) { "md5 is required, even when null" }
      check(sha1State !== FieldState.Absent) { "sha1 is required, even when null" }
      check(sha256State !== FieldState.Absent) { "sha256 is required, even when null" }
      check(stateState !== FieldState.Absent) { "state is required, even when null" }
      return InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219(
        contentType = contentType,
        createdAt = createdAt,
        downloadUrl = downloadUrl,
        id = id,
        md5 = md5State.valueOrNull(),
        name = name,
        sha1 = sha1State.valueOrNull(),
        sha256 = sha256State.valueOrNull(),
        size = size,
        state = stateState.valueOrNull(),
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 must be a JSON object")
      val contentType = json.decodeRequired<String>(rawObject, "content_type")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val downloadUrl = json.decodeRequired<String>(rawObject, "download_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("md5")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 is missing required property 'md5'")
      }
      val md5 = rawObject["md5"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("sha1")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 is missing required property 'sha1'")
      }
      val sha1 = rawObject["sha1"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("sha256")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 is missing required property 'sha256'")
      }
      val sha256 = rawObject["sha256"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("state")) {
        throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 is missing required property 'state'")
      }
      val state = rawObject["state"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219(
        contentType = contentType,
        createdAt = createdAt,
        downloadUrl = downloadUrl,
        id = id,
        md5 = md5,
        name = name,
        sha1 = sha1,
        sha256 = sha256,
        size = size,
        state = state,
        updatedAt = updatedAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_type", value.contentType)
        put("created_at", value.createdAt)
        put("download_url", value.downloadUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("md5", value.md5?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("sha1", value.sha1?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sha256", value.sha256?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("size", json.encodeToJsonElement(value.size))
        put("state", value.state?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219(block: InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219.Builder.() -> Unit): InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 = InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPackagePublishedPackageValuePackageVersionPackageFilesItemX3373b219 property '" + name + "' is not nullable")
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
