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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import~1lfs/patch/requestBody/content/application~1json
 * /schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1import~1lfs/patch/requestBody/content/application~1json
 * /schema
 */
@Serializable(with = InlineReposImportLfsPatchRequestJsonX10e52359.Serializer::class)
public class InlineReposImportLfsPatchRequestJsonX10e52359(
  /**
   * Whether to store large files during the import. `opt_in` means large files will be stored using Git LFS. `opt_out`
   * means large files will be removed during the import.
   */
  public val useLfs: InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e,
) {
  public class Builder {
    private var useLfsValue: InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e? = null

    public var useLfs: InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e
      get() = requireNotNull(useLfsValue) { "useLfs is required" }
      set(`value`) {
        useLfsValue = value
      }

    public fun build(): InlineReposImportLfsPatchRequestJsonX10e52359 {
      check(useLfsValue != null) { "useLfs is required" }
      return InlineReposImportLfsPatchRequestJsonX10e52359(
        useLfs = useLfs,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposImportLfsPatchRequestJsonX10e52359 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposImportLfsPatchRequestJsonX10e52359> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposImportLfsPatchRequestJsonX10e52359 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposImportLfsPatchRequestJsonX10e52359")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposImportLfsPatchRequestJsonX10e52359 must be a JSON object")
      val useLfs = json.decodeRequired<InlineReposImportLfsPatchRequestJsonUseLfsXa50a2a2e>(rawObject, "use_lfs")
      return InlineReposImportLfsPatchRequestJsonX10e52359(
        useLfs = useLfs,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposImportLfsPatchRequestJsonX10e52359) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposImportLfsPatchRequestJsonX10e52359")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("use_lfs", json.encodeToJsonElement(value.useLfs))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposImportLfsPatchRequestJsonX10e52359(block: InlineReposImportLfsPatchRequestJsonX10e52359.Builder.() -> Unit): InlineReposImportLfsPatchRequestJsonX10e52359 = InlineReposImportLfsPatchRequestJsonX10e52359.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposImportLfsPatchRequestJsonX10e52359 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposImportLfsPatchRequestJsonX10e52359 property '" + name + "' is not nullable")
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
