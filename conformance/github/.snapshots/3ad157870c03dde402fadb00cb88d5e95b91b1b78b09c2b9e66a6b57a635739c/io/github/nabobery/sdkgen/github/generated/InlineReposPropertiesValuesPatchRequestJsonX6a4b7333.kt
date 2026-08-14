package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1properties~1values/patch/requestBody/content/applicatio
 * n~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1properties~1values/patch/requestBody/content/applicatio
 * n~1json/schema
 */
@Serializable(with = InlineReposPropertiesValuesPatchRequestJsonX6a4b7333.Serializer::class)
public class InlineReposPropertiesValuesPatchRequestJsonX6a4b7333(
  properties: List<CustomPropertyValue>,
) {
  /**
   * A list of custom property names and associated values to apply to the repositories.
   */
  public val properties: List<CustomPropertyValue> = properties.toList()

  public class Builder {
    private var propertiesValue: List<CustomPropertyValue>? = null

    public var properties: List<CustomPropertyValue>
      get() = requireNotNull(propertiesValue) { "properties is required" }.toList()
      set(`value`) {
        propertiesValue = value.toList()
      }

    public fun build(): InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 {
      check(propertiesValue != null) { "properties is required" }
      return InlineReposPropertiesValuesPatchRequestJsonX6a4b7333(
        properties = properties,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPropertiesValuesPatchRequestJsonX6a4b7333> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPropertiesValuesPatchRequestJsonX6a4b7333")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 must be a JSON object")
      val properties = json.decodeRequired<List<CustomPropertyValue>>(rawObject, "properties")
      return InlineReposPropertiesValuesPatchRequestJsonX6a4b7333(
        properties = properties,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPropertiesValuesPatchRequestJsonX6a4b7333) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPropertiesValuesPatchRequestJsonX6a4b7333")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("properties", json.encodeToJsonElement(value.properties))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPropertiesValuesPatchRequestJsonX6a4b7333(block: InlineReposPropertiesValuesPatchRequestJsonX6a4b7333.Builder.() -> Unit): InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 = InlineReposPropertiesValuesPatchRequestJsonX6a4b7333.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposPropertiesValuesPatchRequestJsonX6a4b7333 property '" + name + "' is not nullable")
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
