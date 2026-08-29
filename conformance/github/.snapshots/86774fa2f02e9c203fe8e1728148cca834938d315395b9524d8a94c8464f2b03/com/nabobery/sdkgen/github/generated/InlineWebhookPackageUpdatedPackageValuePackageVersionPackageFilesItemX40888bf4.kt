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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/package_files/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-package-updated/properties/package/properties/package_versio
 * n/properties/package_files/items
 */
@Serializable(with = InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4.Serializer::class)
public class InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4(
  public val contentType: String,
  public val createdAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val downloadUrl: String,
  public val id: Int,
  public val md5: String?,
  public val name: String,
  public val sha1: String?,
  public val sha256: String,
  public val size: Int,
  public val state: String,
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

    private var sha256Value: String? = null

    public var sha256: String
      get() = requireNotNull(sha256Value) { "sha256 is required" }
      set(`value`) {
        sha256Value = value
      }

    private var sizeValue: Int? = null

    public var size: Int
      get() = requireNotNull(sizeValue) { "size is required" }
      set(`value`) {
        sizeValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
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

    public fun build(): InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 {
      check(contentTypeValue != null) { "contentType is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(downloadUrlValue != null) { "downloadUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(sha256Value != null) { "sha256 is required" }
      check(sizeValue != null) { "size is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(md5State !== FieldState.Absent) { "md5 is required, even when null" }
      check(sha1State !== FieldState.Absent) { "sha1 is required, even when null" }
      return InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4(
        contentType = contentType,
        createdAt = createdAt,
        downloadUrl = downloadUrl,
        id = id,
        md5 = md5State.valueOrNull(),
        name = name,
        sha1 = sha1State.valueOrNull(),
        sha256 = sha256,
        size = size,
        state = state,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 must be a JSON object")
      val contentType = json.decodeRequired<String>(rawObject, "content_type")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val downloadUrl = json.decodeRequired<String>(rawObject, "download_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val sha256 = json.decodeRequired<String>(rawObject, "sha256")
      val size = json.decodeRequired<Int>(rawObject, "size")
      val state = json.decodeRequired<String>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("md5")) {
        throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 is missing required property 'md5'")
      }
      val md5 = rawObject["md5"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("sha1")) {
        throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 is missing required property 'sha1'")
      }
      val sha1 = rawObject["sha1"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content_type", value.contentType)
        put("created_at", value.createdAt)
        put("download_url", value.downloadUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("md5", value.md5?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("sha1", value.sha1?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("sha256", value.sha256)
        put("size", json.encodeToJsonElement(value.size))
        put("state", value.state)
        put("updated_at", value.updatedAt)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4(block: InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4.Builder.() -> Unit): InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 = InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookPackageUpdatedPackageValuePackageVersionPackageFilesItemX40888bf4 property '" + name + "' is not nullable")
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
