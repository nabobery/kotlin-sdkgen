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
 * Successful deletion of a code scanning analysis
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-analysis-deletion
 */
@Serializable(with = CodeScanningAnalysisDeletion.Serializer::class)
public class CodeScanningAnalysisDeletion(
  /**
   * Next deletable analysis in chain, with last analysis deletion confirmation
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val confirmDeleteUrl: String?,
  /**
   * Next deletable analysis in chain, without last analysis deletion confirmation
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val nextAnalysisUrl: String?,
) {
  public class Builder {
    private var confirmDeleteUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Next deletable analysis in chain, with last analysis deletion confirmation
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var confirmDeleteUrl: String?
      get() = confirmDeleteUrlState.valueOrNull()
      set(`value`) {
        confirmDeleteUrlState = value.toNullableFieldState()
      }

    private var nextAnalysisUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Next deletable analysis in chain, without last analysis deletion confirmation
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var nextAnalysisUrl: String?
      get() = nextAnalysisUrlState.valueOrNull()
      set(`value`) {
        nextAnalysisUrlState = value.toNullableFieldState()
      }

    public fun build(): CodeScanningAnalysisDeletion {
      check(confirmDeleteUrlState !== FieldState.Absent) { "confirmDeleteUrl is required, even when null" }
      check(nextAnalysisUrlState !== FieldState.Absent) { "nextAnalysisUrl is required, even when null" }
      return CodeScanningAnalysisDeletion(
        confirmDeleteUrl = confirmDeleteUrlState.valueOrNull(),
        nextAnalysisUrl = nextAnalysisUrlState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAnalysisDeletion = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAnalysisDeletion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAnalysisDeletion {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAnalysisDeletion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAnalysisDeletion must be a JSON object")
      if (!rawObject.containsKey("confirm_delete_url")) {
        throw SerializationException("CodeScanningAnalysisDeletion is missing required property 'confirm_delete_url'")
      }
      val confirmDeleteUrl = rawObject["confirm_delete_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("next_analysis_url")) {
        throw SerializationException("CodeScanningAnalysisDeletion is missing required property 'next_analysis_url'")
      }
      val nextAnalysisUrl = rawObject["next_analysis_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CodeScanningAnalysisDeletion(
        confirmDeleteUrl = confirmDeleteUrl,
        nextAnalysisUrl = nextAnalysisUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAnalysisDeletion) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAnalysisDeletion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("confirm_delete_url", value.confirmDeleteUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("next_analysis_url", value.nextAnalysisUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAnalysisDeletion(block: CodeScanningAnalysisDeletion.Builder.() -> Unit): CodeScanningAnalysisDeletion = CodeScanningAnalysisDeletion.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CodeScanningAnalysisDeletion property '" + name + "' is not nullable")
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
