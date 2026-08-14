package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/job/properties/steps/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/job/properties/steps/items
 */
@Serializable(with = InlineJobStepsItemX5c6597f4.Serializer::class)
public class InlineJobStepsItemX5c6597f4 internal constructor(
  /**
   * The outcome of the job.
   */
  public val conclusion: String?,
  /**
   * The name of the job.
   */
  public val name: String,
  public val number: Int,
  /**
   * The phase of the lifecycle that the job is currently in.
   */
  public val status: InlineJobStepsItemStatusXbcd06d9c,
  private val completedAtState: FieldState<String?>,
  private val startedAtState: FieldState<String?>,
) {
  /**
   * The time that the job finished, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String?
    get() = completedAtState.valueOrNull()

  /**
   * The time that the step started, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startedAt: String?
    get() = startedAtState.valueOrNull()

  public constructor(
    conclusion: String?,
    name: String,
    number: Int,
    status: InlineJobStepsItemStatusXbcd06d9c,
  ) : this(conclusion = conclusion,
  name = name,
  number = number,
  status = status,
  completedAtState = FieldState.Absent,
  startedAtState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `completed_at`.
   */
  public fun completedAtPresence(): FieldPresence = completedAtState.presence

  /**
   * Returns the wire presence of `started_at`.
   */
  public fun startedAtPresence(): FieldPresence = startedAtState.presence

  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var statusValue: InlineJobStepsItemStatusXbcd06d9c? = null

    public var status: InlineJobStepsItemStatusXbcd06d9c
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var conclusionState: FieldState<String?> = FieldState.Absent

    /**
     * The outcome of the job.
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: String?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time that the job finished, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var startedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The time that the step started, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var startedAt: String?
      get() = startedAtState.valueOrNull()
      set(`value`) {
        startedAtState = value.toNullableFieldState()
      }

    /**
     * Omits `completed_at` from serialized output.
     */
    public fun unsetCompletedAt() {
      completedAtState = FieldState.Absent
    }

    /**
     * Omits `started_at` from serialized output.
     */
    public fun unsetStartedAt() {
      startedAtState = FieldState.Absent
    }

    public fun build(): InlineJobStepsItemX5c6597f4 {
      check(nameValue != null) { "name is required" }
      check(numberValue != null) { "number is required" }
      check(statusValue != null) { "status is required" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      return InlineJobStepsItemX5c6597f4(
        conclusion = conclusionState.valueOrNull(),
        name = name,
        number = number,
        status = status,
        completedAtState = completedAtState,
        startedAtState = startedAtState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineJobStepsItemX5c6597f4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineJobStepsItemX5c6597f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineJobStepsItemX5c6597f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineJobStepsItemX5c6597f4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineJobStepsItemX5c6597f4 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val status = json.decodeRequired<InlineJobStepsItemStatusXbcd06d9c>(rawObject, "status")
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineJobStepsItemX5c6597f4 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineJobStepsItemX5c6597f4(
        conclusion = conclusion,
        name = name,
        number = number,
        status = status,
        completedAtState = json.decodeOptional(rawObject, "completed_at", nullable = true),
        startedAtState = json.decodeOptional(rawObject, "started_at", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineJobStepsItemX5c6597f4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineJobStepsItemX5c6597f4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("name", value.name)
        put("number", json.encodeToJsonElement(value.number))
        put("status", json.encodeToJsonElement(value.status))
        putState("completed_at", value.completedAtState, json::encodeToJsonElement)
        putState("started_at", value.startedAtState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineJobStepsItemX5c6597f4(block: InlineJobStepsItemX5c6597f4.Builder.() -> Unit): InlineJobStepsItemX5c6597f4 = InlineJobStepsItemX5c6597f4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineJobStepsItemX5c6597f4 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineJobStepsItemX5c6597f4 property '" + name + "' is not nullable")
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
