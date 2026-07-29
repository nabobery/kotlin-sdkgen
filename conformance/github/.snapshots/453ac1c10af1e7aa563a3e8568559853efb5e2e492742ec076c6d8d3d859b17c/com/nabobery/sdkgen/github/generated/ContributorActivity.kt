package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * Contributor Activity
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/contributor-activity
 */
@Serializable(with = ContributorActivity.Serializer::class)
public class ContributorActivity(
  public val author: NullableSimpleUser?,
  public val total: Int,
  weeks: List<InlineContributorActivityWeeksItemX6d12ef3c>,
) {
  public val weeks: List<InlineContributorActivityWeeksItemX6d12ef3c> = weeks.toList()

  public class Builder {
    private var totalValue: Int? = null

    public var total: Int
      get() = requireNotNull(totalValue) { "total is required" }
      set(`value`) {
        totalValue = value
      }

    private var weeksValue: List<InlineContributorActivityWeeksItemX6d12ef3c>? = null

    public var weeks: List<InlineContributorActivityWeeksItemX6d12ef3c>
      get() = requireNotNull(weeksValue) { "weeks is required" }.toList()
      set(`value`) {
        weeksValue = value.toList()
      }

    private var authorState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var author: NullableSimpleUser?
      get() = authorState.valueOrNull()
      set(`value`) {
        authorState = value.toNullableFieldState()
      }

    public fun build(): ContributorActivity {
      check(totalValue != null) { "total is required" }
      check(weeksValue != null) { "weeks is required" }
      check(authorState !== FieldState.Absent) { "author is required, even when null" }
      return ContributorActivity(
        author = authorState.valueOrNull(),
        total = total,
        weeks = weeks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ContributorActivity = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ContributorActivity> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ContributorActivity {
      val jsonDecoder = decoder.requireJsonDecoder("ContributorActivity")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ContributorActivity must be a JSON object")
      val total = json.decodeRequired<Int>(rawObject, "total")
      val weeks = json.decodeRequired<List<InlineContributorActivityWeeksItemX6d12ef3c>>(rawObject, "weeks")
      if (!rawObject.containsKey("author")) {
        throw SerializationException("ContributorActivity is missing required property 'author'")
      }
      val author = rawObject["author"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return ContributorActivity(
        author = author,
        total = total,
        weeks = weeks,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ContributorActivity) {
      val jsonEncoder = encoder.requireJsonEncoder("ContributorActivity")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("author", value.author?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("total", json.encodeToJsonElement(value.total))
        put("weeks", json.encodeToJsonElement(value.weeks))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun contributorActivity(block: ContributorActivity.Builder.() -> Unit): ContributorActivity = ContributorActivity.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ContributorActivity is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ContributorActivity property '" + name + "' is not nullable")
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
