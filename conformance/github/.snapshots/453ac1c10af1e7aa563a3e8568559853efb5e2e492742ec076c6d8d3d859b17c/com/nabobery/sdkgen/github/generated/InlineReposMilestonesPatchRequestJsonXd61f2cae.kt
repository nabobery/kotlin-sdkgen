package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones~1{milestone_number}/patch/requestBody/conten
 * t/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1milestones~1{milestone_number}/patch/requestBody/conten
 * t/application~1json/schema
 */
@Serializable(with = InlineReposMilestonesPatchRequestJsonXd61f2cae.Serializer::class)
public class InlineReposMilestonesPatchRequestJsonXd61f2cae internal constructor(
  private val descriptionState: FieldState<String>,
  private val dueOnState: FieldState<String>,
  private val stateState: FieldState<InlineReposMilestonesPatchRequestJsonStateX305f19b5>,
  private val titleState: FieldState<String>,
) {
  /**
   * A description of the milestone.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
   * `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val dueOn: String?
    get() = dueOnState.valueOrNull()

  /**
   * The state of the milestone. Either `open` or `closed`.
   */
  public val state: InlineReposMilestonesPatchRequestJsonStateX305f19b5?
    get() = stateState.valueOrNull()

  /**
   * The title of the milestone.
   */
  public val title: String?
    get() = titleState.valueOrNull()

  public constructor() : this(descriptionState = FieldState.Absent,
  dueOnState = FieldState.Absent,
  stateState = FieldState.Absent,
  titleState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `due_on`.
   */
  public fun dueOnPresence(): FieldPresence = dueOnState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `title`.
   */
  public fun titlePresence(): FieldPresence = titleState.presence

  public class Builder {
    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * A description of the milestone.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var dueOnState: FieldState<String> = FieldState.Absent

    /**
     * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dueOn: String?
      get() = dueOnState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dueOn is not nullable; call unsetDueOn() to omit it" }
        dueOnState = FieldState.Value(present)
      }

    private var stateState: FieldState<InlineReposMilestonesPatchRequestJsonStateX305f19b5> =
        FieldState.Absent

    /**
     * The state of the milestone. Either `open` or `closed`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineReposMilestonesPatchRequestJsonStateX305f19b5?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var titleState: FieldState<String> = FieldState.Absent

    /**
     * The title of the milestone.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var title: String?
      get() = titleState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "title is not nullable; call unsetTitle() to omit it" }
        titleState = FieldState.Value(present)
      }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `due_on` from serialized output.
     */
    public fun unsetDueOn() {
      dueOnState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `title` from serialized output.
     */
    public fun unsetTitle() {
      titleState = FieldState.Absent
    }

    public fun build(): InlineReposMilestonesPatchRequestJsonXd61f2cae = InlineReposMilestonesPatchRequestJsonXd61f2cae(
      descriptionState = descriptionState,
      dueOnState = dueOnState,
      stateState = stateState,
      titleState = titleState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposMilestonesPatchRequestJsonXd61f2cae = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposMilestonesPatchRequestJsonXd61f2cae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposMilestonesPatchRequestJsonXd61f2cae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposMilestonesPatchRequestJsonXd61f2cae")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposMilestonesPatchRequestJsonXd61f2cae must be a JSON object")
      return InlineReposMilestonesPatchRequestJsonXd61f2cae(
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        dueOnState = json.decodeOptional(rawObject, "due_on", nullable = false),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        titleState = json.decodeOptional(rawObject, "title", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposMilestonesPatchRequestJsonXd61f2cae) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposMilestonesPatchRequestJsonXd61f2cae")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("due_on", value.dueOnState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("title", value.titleState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposMilestonesPatchRequestJsonXd61f2cae(block: InlineReposMilestonesPatchRequestJsonXd61f2cae.Builder.() -> Unit): InlineReposMilestonesPatchRequestJsonXd61f2cae = InlineReposMilestonesPatchRequestJsonXd61f2cae.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposMilestonesPatchRequestJsonXd61f2cae property '" + name + "' is not nullable")
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
