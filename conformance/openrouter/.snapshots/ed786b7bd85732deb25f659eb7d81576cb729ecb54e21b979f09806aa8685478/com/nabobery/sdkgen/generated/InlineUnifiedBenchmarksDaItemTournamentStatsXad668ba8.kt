package com.nabobery.sdkgen.generated

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
 * Placement distribution from tournament matches.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/UnifiedBenchmarksDAItem/properties/tournament_stats
 */
@Serializable(with = InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8.Serializer::class)
public class InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8(
  public val firstPlace: Int?,
  public val fourthPlace: Int?,
  public val secondPlace: Int?,
  public val thirdPlace: Int?,
  public val total: Int?,
) {
  public class Builder {
    private var firstPlaceState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var firstPlace: Int?
      get() = firstPlaceState.valueOrNull()
      set(`value`) {
        firstPlaceState = value.toNullableFieldState()
      }

    private var fourthPlaceState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var fourthPlace: Int?
      get() = fourthPlaceState.valueOrNull()
      set(`value`) {
        fourthPlaceState = value.toNullableFieldState()
      }

    private var secondPlaceState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var secondPlace: Int?
      get() = secondPlaceState.valueOrNull()
      set(`value`) {
        secondPlaceState = value.toNullableFieldState()
      }

    private var thirdPlaceState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var thirdPlace: Int?
      get() = thirdPlaceState.valueOrNull()
      set(`value`) {
        thirdPlaceState = value.toNullableFieldState()
      }

    private var totalState: FieldState<Int?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var total: Int?
      get() = totalState.valueOrNull()
      set(`value`) {
        totalState = value.toNullableFieldState()
      }

    public fun build(): InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 {
      check(firstPlaceState !== FieldState.Absent) { "firstPlace is required, even when null" }
      check(fourthPlaceState !== FieldState.Absent) { "fourthPlace is required, even when null" }
      check(secondPlaceState !== FieldState.Absent) { "secondPlace is required, even when null" }
      check(thirdPlaceState !== FieldState.Absent) { "thirdPlace is required, even when null" }
      check(totalState !== FieldState.Absent) { "total is required, even when null" }
      return InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8(
        firstPlace = firstPlaceState.valueOrNull(),
        fourthPlace = fourthPlaceState.valueOrNull(),
        secondPlace = secondPlaceState.valueOrNull(),
        thirdPlace = thirdPlaceState.valueOrNull(),
        total = totalState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 must be a JSON object")
      if (!rawObject.containsKey("first_place")) {
        throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 is missing required property 'first_place'")
      }
      val firstPlace = rawObject["first_place"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("fourth_place")) {
        throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 is missing required property 'fourth_place'")
      }
      val fourthPlace = rawObject["fourth_place"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("second_place")) {
        throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 is missing required property 'second_place'")
      }
      val secondPlace = rawObject["second_place"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("third_place")) {
        throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 is missing required property 'third_place'")
      }
      val thirdPlace = rawObject["third_place"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("total")) {
        throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 is missing required property 'total'")
      }
      val total = rawObject["total"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      return InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8(
        firstPlace = firstPlace,
        fourthPlace = fourthPlace,
        secondPlace = secondPlace,
        thirdPlace = thirdPlace,
        total = total,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("first_place", value.firstPlace?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("fourth_place", value.fourthPlace?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("second_place", value.secondPlace?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("third_place", value.thirdPlace?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("total", value.total?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8(block: InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8.Builder.() -> Unit): InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 = InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineUnifiedBenchmarksDaItemTournamentStatsXad668ba8 property '" + name + "' is not nullable")
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
