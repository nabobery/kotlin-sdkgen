package com.nabobery.sdkgen.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/ListEndpointsResponse/properties/architecture/allOf/1.
 */
@Serializable(with = InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1.Serializer::class)
public class InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1(
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
      get() = requireNotNull(inputModalitiesValue) { "inputModalities is required" }
      set(`value`) {
        inputModalitiesValue = value
      }

    private var outputModalitiesValue: List<OutputModality>? = null

    public var outputModalities: List<OutputModality>
      get() = requireNotNull(outputModalitiesValue) { "outputModalities is required" }
      set(`value`) {
        outputModalitiesValue = value
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

    public fun build(): InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 {
      check(inputModalitiesValue != null) { "inputModalities is required" }
      check(outputModalitiesValue != null) { "outputModalities is required" }
      check(instructTypeState !== FieldState.Absent) { "instructType is required, even when null" }
      check(modalityState !== FieldState.Absent) { "modality is required, even when null" }
      check(tokenizerState !== FieldState.Absent) { "tokenizer is required, even when null" }
      return InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1(
        inputModalities = inputModalities,
        instructType = instructTypeState.valueOrNull(),
        modality = modalityState.valueOrNull(),
        outputModalities = outputModalities,
        tokenizer = tokenizerState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 must " +
          "be a JSON object")
      val inputModalities = json.decodeRequired<List<InputModality>>(raw, "input_modalities")
      val outputModalities = json.decodeRequired<List<OutputModality>>(raw, "output_modalities")
      if (!raw.containsKey("instruct_type")) {
        throw SerializationException("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 is " +
          "missing required property 'instruct_type'")
      }
      val instructType = raw["instruct_type"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<InstructType?>(requireNotNull(element)) }
      if (!raw.containsKey("modality")) {
        throw SerializationException("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 is " +
          "missing required property 'modality'")
      }
      val modality = raw["modality"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!raw.containsKey("tokenizer")) {
        throw SerializationException("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 is " +
          "missing required property 'tokenizer'")
      }
      val tokenizer = raw["tokenizer"].let { element -> if (element == JsonNull) null else json
        .decodeFromJsonElement<ModelGroup?>(requireNotNull(element)) }
      return InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1(
        inputModalities = inputModalities,
        instructType = instructType,
        modality = modality,
        outputModalities = outputModalities,
        tokenizer = tokenizer,
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1")
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

public fun inlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1(block: InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1.Builder.() -> Unit): InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 = InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?:
    throw SerializationException("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 is missing " +
      "required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineComponentsSchemasListEndpointsResponsePropertiesArchitectureAllOf1 " +
      "property '" + name + "' is not nullable")
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
