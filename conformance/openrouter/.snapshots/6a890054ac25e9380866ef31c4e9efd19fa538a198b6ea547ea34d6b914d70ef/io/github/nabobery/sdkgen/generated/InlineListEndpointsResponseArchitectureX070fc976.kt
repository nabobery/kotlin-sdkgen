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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ListEndpointsResponse/properties/architecture
 */
@Serializable(with = InlineListEndpointsResponseArchitectureX070fc976.Serializer::class)
public class InlineListEndpointsResponseArchitectureX070fc976(
  inputModalities: List<InputModality>,
  public val instructType: InstructType?,
  /**
   * Primary modality of the model
   */
  public val modality: String?,
  outputModalities: List<OutputModality>,
  public val tokenizer: ModelGroup?,
) {
  /**
   * Supported input modalities
   */
  public val inputModalities: List<InputModality> = inputModalities.toList()

  /**
   * Supported output modalities
   */
  public val outputModalities: List<OutputModality> = outputModalities.toList()

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

    private var instructTypeState: FieldState<InstructType?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var instructType: InstructType?
      get() = instructTypeState.valueOrNull()
      set(`value`) {
        instructTypeState = value.toNullableFieldState()
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

    private var tokenizerState: FieldState<ModelGroup?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var tokenizer: ModelGroup?
      get() = tokenizerState.valueOrNull()
      set(`value`) {
        tokenizerState = value.toNullableFieldState()
      }

    public fun build(): InlineListEndpointsResponseArchitectureX070fc976 {
      check(inputModalitiesValue != null) { "inputModalities is required" }
      check(outputModalitiesValue != null) { "outputModalities is required" }
      check(instructTypeState !== FieldState.Absent) { "instructType is required, even when null" }
      check(modalityState !== FieldState.Absent) { "modality is required, even when null" }
      check(tokenizerState !== FieldState.Absent) { "tokenizer is required, even when null" }
      return InlineListEndpointsResponseArchitectureX070fc976(
        inputModalities = inputModalities,
        instructType = instructTypeState.valueOrNull(),
        modality = modalityState.valueOrNull(),
        outputModalities = outputModalities,
        tokenizer = tokenizerState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineListEndpointsResponseArchitectureX070fc976 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineListEndpointsResponseArchitectureX070fc976> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineListEndpointsResponseArchitectureX070fc976 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineListEndpointsResponseArchitectureX070fc976")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineListEndpointsResponseArchitectureX070fc976 must be a JSON object")
      val inputModalities = json.decodeRequired<List<InputModality>>(rawObject, "input_modalities")
      val outputModalities = json.decodeRequired<List<OutputModality>>(rawObject, "output_modalities")
      if (!rawObject.containsKey("instruct_type")) {
        throw SerializationException("InlineListEndpointsResponseArchitectureX070fc976 is missing required property 'instruct_type'")
      }
      val instructType = rawObject["instruct_type"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InstructType?>(requireNotNull(element)) }
      if (!rawObject.containsKey("modality")) {
        throw SerializationException("InlineListEndpointsResponseArchitectureX070fc976 is missing required property 'modality'")
      }
      val modality = rawObject["modality"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("tokenizer")) {
        throw SerializationException("InlineListEndpointsResponseArchitectureX070fc976 is missing required property 'tokenizer'")
      }
      val tokenizer = rawObject["tokenizer"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<ModelGroup?>(requireNotNull(element)) }
      return InlineListEndpointsResponseArchitectureX070fc976(
        inputModalities = inputModalities,
        instructType = instructType,
        modality = modality,
        outputModalities = outputModalities,
        tokenizer = tokenizer,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineListEndpointsResponseArchitectureX070fc976) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineListEndpointsResponseArchitectureX070fc976")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("input_modalities", json.encodeToJsonElement(value.inputModalities))
        put("instruct_type", value.instructType?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("modality", value.modality?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("output_modalities", json.encodeToJsonElement(value.outputModalities))
        put("tokenizer", value.tokenizer?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineListEndpointsResponseArchitectureX070fc976(block: InlineListEndpointsResponseArchitectureX070fc976.Builder.() -> Unit): InlineListEndpointsResponseArchitectureX070fc976 = InlineListEndpointsResponseArchitectureX070fc976.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineListEndpointsResponseArchitectureX070fc976 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineListEndpointsResponseArchitectureX070fc976 property '" + name + "' is not nullable")
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
