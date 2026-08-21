package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * License
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/license
 */
@Serializable(with = License.Serializer::class)
public class License(
  public val body: String,
  conditions: List<String>,
  public val description: String,
  public val featured: Boolean,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val implementation: String,
  public val key: String,
  limitations: List<String>,
  public val name: String,
  public val nodeId: String,
  permissions: List<String>,
  public val spdxId: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String?,
) {
  public val conditions: List<String> = conditions.toList()

  public val limitations: List<String> = limitations.toList()

  public val permissions: List<String> = permissions.toList()

  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    private var conditionsValue: List<String>? = null

    public var conditions: List<String>
      get() = requireNotNull(conditionsValue) { "conditions is required" }.toList()
      set(`value`) {
        conditionsValue = value.toList()
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var featuredValue: Boolean? = null

    public var featured: Boolean
      get() = requireNotNull(featuredValue) { "featured is required" }
      set(`value`) {
        featuredValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var implementationValue: String? = null

    public var implementation: String
      get() = requireNotNull(implementationValue) { "implementation is required" }
      set(`value`) {
        implementationValue = value
      }

    private var keyValue: String? = null

    public var key: String
      get() = requireNotNull(keyValue) { "key is required" }
      set(`value`) {
        keyValue = value
      }

    private var limitationsValue: List<String>? = null

    public var limitations: List<String>
      get() = requireNotNull(limitationsValue) { "limitations is required" }.toList()
      set(`value`) {
        limitationsValue = value.toList()
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var permissionsValue: List<String>? = null

    public var permissions: List<String>
      get() = requireNotNull(permissionsValue) { "permissions is required" }.toList()
      set(`value`) {
        permissionsValue = value.toList()
      }

    private var spdxIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var spdxId: String?
      get() = spdxIdState.valueOrNull()
      set(`value`) {
        spdxIdState = value.toNullableFieldState()
      }

    private var urlState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        urlState = value.toNullableFieldState()
      }

    public fun build(): License {
      check(bodyValue != null) { "body is required" }
      check(conditionsValue != null) { "conditions is required" }
      check(descriptionValue != null) { "description is required" }
      check(featuredValue != null) { "featured is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(implementationValue != null) { "implementation is required" }
      check(keyValue != null) { "key is required" }
      check(limitationsValue != null) { "limitations is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(spdxIdState !== FieldState.Absent) { "spdxId is required, even when null" }
      check(urlState !== FieldState.Absent) { "url is required, even when null" }
      return License(
        body = body,
        conditions = conditions,
        description = description,
        featured = featured,
        htmlUrl = htmlUrl,
        implementation = implementation,
        key = key,
        limitations = limitations,
        name = name,
        nodeId = nodeId,
        permissions = permissions,
        spdxId = spdxIdState.valueOrNull(),
        url = urlState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): License = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<License> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): License {
      val jsonDecoder = decoder.requireJsonDecoder("License")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("License must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      val conditions = json.decodeRequired<List<String>>(rawObject, "conditions")
      val description = json.decodeRequired<String>(rawObject, "description")
      val featured = json.decodeRequired<Boolean>(rawObject, "featured")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val implementation = json.decodeRequired<String>(rawObject, "implementation")
      val key = json.decodeRequired<String>(rawObject, "key")
      val limitations = json.decodeRequired<List<String>>(rawObject, "limitations")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val permissions = json.decodeRequired<List<String>>(rawObject, "permissions")
      if (!rawObject.containsKey("spdx_id")) {
        throw SerializationException("License is missing required property 'spdx_id'")
      }
      val spdxId = rawObject["spdx_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("url")) {
        throw SerializationException("License is missing required property 'url'")
      }
      val url = rawObject["url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return License(
        body = body,
        conditions = conditions,
        description = description,
        featured = featured,
        htmlUrl = htmlUrl,
        implementation = implementation,
        key = key,
        limitations = limitations,
        name = name,
        nodeId = nodeId,
        permissions = permissions,
        spdxId = spdxId,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: License) {
      val jsonEncoder = encoder.requireJsonEncoder("License")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
        put("conditions", json.encodeToJsonElement(value.conditions))
        put("description", value.description)
        put("featured", json.encodeToJsonElement(value.featured))
        put("html_url", value.htmlUrl)
        put("implementation", value.implementation)
        put("key", value.key)
        put("limitations", json.encodeToJsonElement(value.limitations))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("spdx_id", value.spdxId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun license(block: License.Builder.() -> Unit): License = License.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("License is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("License property '" + name + "' is not nullable")
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
