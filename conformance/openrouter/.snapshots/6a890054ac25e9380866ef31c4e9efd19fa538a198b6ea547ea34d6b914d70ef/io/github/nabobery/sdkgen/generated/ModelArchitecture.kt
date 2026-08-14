package io.github.nabobery.sdkgen.generated

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
 * Model architecture information
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ModelArchitecture
 */
@Serializable(with = ModelArchitecture.Serializer::class)
public class ModelArchitecture internal constructor(
  inputModalities: List<InputModality>,
  /**
   * Primary modality of the model
   */
  public val modality: String?,
  outputModalities: List<OutputModality>,
  private val instructTypeState: FieldState<InstructType?>,
  private val tokenizerState: FieldState<ModelGroup>,
) {
  /**
   * Supported input modalities
   */
  public val inputModalities: List<InputModality> = inputModalities.toList()

  /**
   * Supported output modalities
   */
  public val outputModalities: List<OutputModality> = outputModalities.toList()

  public val instructType: InstructType?
    get() = instructTypeState.valueOrNull()

  public val tokenizer: ModelGroup?
    get() = tokenizerState.valueOrNull()

  public constructor(
    inputModalities: List<InputModality>,
    modality: String?,
    outputModalities: List<OutputModality>,
  ) : this(inputModalities = inputModalities,
  modality = modality,
  outputModalities = outputModalities,
  instructTypeState = FieldState.Absent,
  tokenizerState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `instruct_type`.
   */
  public fun instructTypePresence(): FieldPresence = instructTypeState.presence

  /**
   * Returns the wire presence of `tokenizer`.
   */
  public fun tokenizerPresence(): FieldPresence = tokenizerState.presence

  public class Builder {
    private var inputModalitiesValue: List<InputModality>? = null

    public var inputModalities: List<InputModality>
      get() = requireNotNull(inputModalitiesValue) { "inputModalities is required" }.toList()
      set(`value`) {
        inputModalitiesValue = value.toList()
      }

    private var outputModalitiesValue: List<OutputModality>? = null

    public var outputModalities: List<OutputModality>
      get() = requireNotNull(outputModalitiesValue) { "outputModalities is required" }.toList()
      set(`value`) {
        outputModalitiesValue = value.toList()
      }

    private var modalityState: FieldState<String?> = FieldState.Absent

    /**
     * Primary modality of the model
     * Required nullable field; assigning `null` records present-null.
     */
    public var modality: String?
      get() = modalityState.valueOrNull()
      set(`value`) {
        modalityState = value.toNullableFieldState()
      }

    private var instructTypeState: FieldState<InstructType?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var instructType: InstructType?
      get() = instructTypeState.valueOrNull()
      set(`value`) {
        instructTypeState = value.toNullableFieldState()
      }

    private var tokenizerState: FieldState<ModelGroup> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tokenizer: ModelGroup?
      get() = tokenizerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tokenizer is not nullable; call unsetTokenizer() to omit it" }
        tokenizerState = FieldState.Value(present)
      }

    /**
     * Omits `instruct_type` from serialized output.
     */
    public fun unsetInstructType() {
      instructTypeState = FieldState.Absent
    }

    /**
     * Omits `tokenizer` from serialized output.
     */
    public fun unsetTokenizer() {
      tokenizerState = FieldState.Absent
    }

    public fun build(): ModelArchitecture {
      check(inputModalitiesValue != null) { "inputModalities is required" }
      check(outputModalitiesValue != null) { "outputModalities is required" }
      check(modalityState !== FieldState.Absent) { "modality is required, even when null" }
      return ModelArchitecture(
        inputModalities = inputModalities,
        modality = modalityState.valueOrNull(),
        outputModalities = outputModalities,
        instructTypeState = instructTypeState,
        tokenizerState = tokenizerState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ModelArchitecture = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ModelArchitecture> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ModelArchitecture {
      val jsonDecoder = decoder.requireJsonDecoder("ModelArchitecture")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ModelArchitecture must be a JSON object")
      val inputModalities = json.decodeRequired<List<InputModality>>(rawObject, "input_modalities")
      val outputModalities = json.decodeRequired<List<OutputModality>>(rawObject, "output_modalities")
      if (!rawObject.containsKey("modality")) {
        throw SerializationException("ModelArchitecture is missing required property 'modality'")
      }
      val modality = rawObject["modality"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return ModelArchitecture(
        inputModalities = inputModalities,
        modality = modality,
        outputModalities = outputModalities,
        instructTypeState = json.decodeOptional(rawObject, "instruct_type", nullable = true),
        tokenizerState = json.decodeOptional(rawObject, "tokenizer", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: ModelArchitecture) {
      val jsonEncoder = encoder.requireJsonEncoder("ModelArchitecture")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_modalities", json.encodeToJsonElement(value.inputModalities))
        put("modality", value.modality?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("output_modalities", json.encodeToJsonElement(value.outputModalities))
        putState("instruct_type", value.instructTypeState, json::encodeToJsonElement)
        putState("tokenizer", value.tokenizerState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun modelArchitecture(block: ModelArchitecture.Builder.() -> Unit): ModelArchitecture = ModelArchitecture.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ModelArchitecture is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("ModelArchitecture property '" + name + "' is not nullable")
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
