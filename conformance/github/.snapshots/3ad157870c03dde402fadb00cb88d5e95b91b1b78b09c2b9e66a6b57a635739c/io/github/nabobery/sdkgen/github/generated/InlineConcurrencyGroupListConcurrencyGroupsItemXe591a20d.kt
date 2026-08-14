package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-list/properties/concurrency_groups/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-list/properties/concurrency_groups/items
 */
@Serializable(with = InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d.Serializer::class)
public class InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d(
  /**
   * The name of the concurrency group.
   */
  public val groupName: String,
  /**
   * API URL for this concurrency group.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val groupUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastAcquiredAt: String?,
) {
  public class Builder {
    private var groupNameValue: String? = null

    public var groupName: String
      get() = requireNotNull(groupNameValue) { "groupName is required" }
      set(`value`) {
        groupNameValue = value
      }

    private var groupUrlValue: String? = null

    public var groupUrl: String
      get() = requireNotNull(groupUrlValue) { "groupUrl is required" }
      set(`value`) {
        groupUrlValue = value
      }

    private var lastAcquiredAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var lastAcquiredAt: String?
      get() = lastAcquiredAtState.valueOrNull()
      set(`value`) {
        lastAcquiredAtState = value.toNullableFieldState()
      }

    public fun build(): InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d {
      check(groupNameValue != null) { "groupName is required" }
      check(groupUrlValue != null) { "groupUrl is required" }
      check(lastAcquiredAtState !== FieldState.Absent) { "lastAcquiredAt is required, even when null" }
      return InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d(
        groupName = groupName,
        groupUrl = groupUrl,
        lastAcquiredAt = lastAcquiredAtState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d must be a JSON object")
      val groupName = json.decodeRequired<String>(rawObject, "group_name")
      val groupUrl = json.decodeRequired<String>(rawObject, "group_url")
      if (!rawObject.containsKey("last_acquired_at")) {
        throw SerializationException("InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d is missing required property 'last_acquired_at'")
      }
      val lastAcquiredAt = rawObject["last_acquired_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d(
        groupName = groupName,
        groupUrl = groupUrl,
        lastAcquiredAt = lastAcquiredAt,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("group_name", value.groupName)
        put("group_url", value.groupUrl)
        put("last_acquired_at", value.lastAcquiredAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d(block: InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d.Builder.() -> Unit): InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d = InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineConcurrencyGroupListConcurrencyGroupsItemXe591a20d property '" + name + "' is not nullable")
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
