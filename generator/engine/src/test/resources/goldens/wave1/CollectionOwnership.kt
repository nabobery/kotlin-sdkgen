package com.example.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.Set
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
 * Collection ownership fixture.
 */
@Serializable(with = CollectionOwnership.Serializer::class)
public class CollectionOwnership internal constructor(
  requiredList: List<String>,
  requiredNullableSet: Set<String>?,
  optionalNullableListState: FieldState<List<String>>,
  optionalMapState: FieldState<Map<String, String>>,
) {
  public val requiredList: List<String> = requiredList.toList()

  public val requiredNullableSet: Set<String>? =
      requiredNullableSet?.let { collection0 -> collection0.toSet() }

  private val optionalNullableListState: FieldState<List<String>> =
      optionalNullableListState.copyValue { fieldValue -> fieldValue.toList() }

  private val optionalMapState: FieldState<Map<String, String>> =
      optionalMapState.copyValue { fieldValue -> fieldValue.toMap() }

  public val optionalNullableList: List<String>?
    get() = optionalNullableListState.valueOrNull()

  public val optionalMap: Map<String, String>?
    get() = optionalMapState.valueOrNull()

  public constructor(requiredList: List<String>, requiredNullableSet: Set<String>?) : this(requiredList = requiredList,
  requiredNullableSet = requiredNullableSet,
  optionalNullableListState = FieldState.Absent,
  optionalMapState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `optionalNullableList`.
   */
  public fun optionalNullableListPresence(): FieldPresence = optionalNullableListState.presence

  /**
   * Returns the wire presence of `optionalMap`.
   */
  public fun optionalMapPresence(): FieldPresence = optionalMapState.presence

  public class Builder {
    private var requiredListValue: List<String>? = null

    public var requiredList: List<String>
      get() = requireNotNull(requiredListValue) { "requiredList is required" }.toList()
      set(`value`) {
        requiredListValue = value.toList()
      }

    private var requiredNullableSetState: FieldState<Set<String>> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var requiredNullableSet: Set<String>?
      get() = requiredNullableSetState.valueOrNull()?.let { collection0 -> collection0.toSet() }
      set(`value`) {
        requiredNullableSetState = value?.let { collection0 -> collection0.toSet() }.toNullableFieldState()
      }

    private var optionalNullableListState: FieldState<List<String>> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var optionalNullableList: List<String>?
      get() = optionalNullableListState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        optionalNullableListState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var optionalMapState: FieldState<Map<String, String>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var optionalMap: Map<String, String>?
      get() = optionalMapState.valueOrNull()?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        val present = requireNotNull(value) { "optionalMap is not nullable; call unsetOptionalMap() to omit it" }
        optionalMapState = FieldState.Value(present.toMap())
      }

    /**
     * Omits `optionalNullableList` from serialized output.
     */
    public fun unsetOptionalNullableList() {
      optionalNullableListState = FieldState.Absent
    }

    /**
     * Omits `optionalMap` from serialized output.
     */
    public fun unsetOptionalMap() {
      optionalMapState = FieldState.Absent
    }

    public fun build(): CollectionOwnership {
      check(requiredListValue != null) { "requiredList is required" }
      check(requiredNullableSetState !== FieldState.Absent) { "requiredNullableSet is required, even when null" }
      return CollectionOwnership(
        requiredList = requiredList,
        requiredNullableSet = requiredNullableSetState.valueOrNull(),
        optionalNullableListState = optionalNullableListState,
        optionalMapState = optionalMapState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CollectionOwnership = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CollectionOwnership> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CollectionOwnership {
      val jsonDecoder = decoder.requireJsonDecoder("CollectionOwnership")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CollectionOwnership must be a JSON object")
      val requiredList = json.decodeRequired<List<String>>(rawObject, "requiredList")
      if (!rawObject.containsKey("requiredNullableSet")) {
        throw SerializationException("CollectionOwnership is missing required property 'requiredNullableSet'")
      }
      val requiredNullableSet = rawObject["requiredNullableSet"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Set<String>>(requireNotNull(element)) }
      return CollectionOwnership(
        requiredList = requiredList,
        requiredNullableSet = requiredNullableSet,
        optionalNullableListState = json.decodeOptional(rawObject, "optionalNullableList", nullable = true),
        optionalMapState = json.decodeOptional(rawObject, "optionalMap", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CollectionOwnership) {
      val jsonEncoder = encoder.requireJsonEncoder("CollectionOwnership")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("requiredList", json.encodeToJsonElement(value.requiredList))
        put("requiredNullableSet", value.requiredNullableSet?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("optionalNullableList", value.optionalNullableListState, json::encodeToJsonElement)
        putState("optionalMap", value.optionalMapState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun collectionOwnership(block: CollectionOwnership.Builder.() -> Unit): CollectionOwnership = CollectionOwnership.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CollectionOwnership is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CollectionOwnership property '" + name + "' is not nullable")
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
