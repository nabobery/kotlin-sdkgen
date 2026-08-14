package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/2.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/2
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e.Serializer::class)
public class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e(
  /**
   * The field's data type.
   */
  public val dataType: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96,
  /**
   * The name of the field.
   */
  public val name: String,
  singleSelectOptions: List<ProjectsV2FieldSingleSelectOption>,
) {
  /**
   * The options available for single select fields. At least one option must be provided when creating a single select
   * field.
   */
  public val singleSelectOptions: List<ProjectsV2FieldSingleSelectOption> =
      singleSelectOptions.toList()

  public class Builder {
    private var dataTypeValue: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96? =
        null

    public var dataType: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var singleSelectOptionsValue: List<ProjectsV2FieldSingleSelectOption>? = null

    public var singleSelectOptions: List<ProjectsV2FieldSingleSelectOption>
      get() = requireNotNull(singleSelectOptionsValue) { "singleSelectOptions is required" }.toList()
      set(`value`) {
        singleSelectOptionsValue = value.toList()
      }

    public fun build(): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e {
      check(dataTypeValue != null) { "dataType is required" }
      check(nameValue != null) { "name is required" }
      check(singleSelectOptionsValue != null) { "singleSelectOptions is required" }
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e(
        dataType = dataType,
        name = name,
        singleSelectOptions = singleSelectOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e must be a JSON object")
      val dataType = json.decodeRequired<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3DataTypeXe2510b96>(rawObject, "data_type")
      val name = json.decodeRequired<String>(rawObject, "name")
      val singleSelectOptions = json.decodeRequired<List<ProjectsV2FieldSingleSelectOption>>(rawObject, "single_select_options")
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e(
        dataType = dataType,
        name = name,
        singleSelectOptions = singleSelectOptions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("name", value.name)
        put("single_select_options", json.encodeToJsonElement(value.singleSelectOptions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e(block: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e.Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf3Xaba0e50e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
