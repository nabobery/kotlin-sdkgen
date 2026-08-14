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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1properties~1values/patch/requestBody/content/application~1json/sch
 * ema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1properties~1values/patch/requestBody/content/application~1json/sch
 * ema
 */
@Serializable(with = InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135.Serializer::class)
public class InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135(
  properties: List<CustomPropertyValue>,
  repositoryNames: List<String>,
) {
  /**
   * List of custom property names and associated values to apply to the repositories.
   */
  public val properties: List<CustomPropertyValue> = properties.toList()

  /**
   * The names of repositories that the custom property values will be applied to.
   */
  public val repositoryNames: List<String> = repositoryNames.toList()

  public class Builder {
    private var propertiesValue: List<CustomPropertyValue>? = null

    public var properties: List<CustomPropertyValue>
      get() = requireNotNull(propertiesValue) { "properties is required" }.toList()
      set(`value`) {
        propertiesValue = value.toList()
      }

    private var repositoryNamesValue: List<String>? = null

    public var repositoryNames: List<String>
      get() = requireNotNull(repositoryNamesValue) { "repositoryNames is required" }.toList()
      set(`value`) {
        repositoryNamesValue = value.toList()
      }

    public fun build(): InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 {
      check(propertiesValue != null) { "properties is required" }
      check(repositoryNamesValue != null) { "repositoryNames is required" }
      return InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135(
        properties = properties,
        repositoryNames = repositoryNames,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 must be a JSON object")
      val properties = json.decodeRequired<List<CustomPropertyValue>>(rawObject, "properties")
      val repositoryNames = json.decodeRequired<List<String>>(rawObject, "repository_names")
      return InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135(
        properties = properties,
        repositoryNames = repositoryNames,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("properties", json.encodeToJsonElement(value.properties))
        put("repository_names", json.encodeToJsonElement(value.repositoryNames))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPropertiesValuesPatchRequestJsonXf8d40135(block: InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135.Builder.() -> Unit): InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 = InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrgsPropertiesValuesPatchRequestJsonXf8d40135 property '" + name + "' is not nullable")
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
