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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/1.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1fields/post/requestBody/conten
 * t/application~1json/schema/oneOf/1
 */
@Serializable(with = InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a.Serializer::class)
public class InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a(
  /**
   * The field's data type.
   */
  public val dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5,
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
    private var dataTypeValue: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5? =
        null

    public var dataType: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5
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

    public fun build(): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a {
      check(dataTypeValue != null) { "dataType is required" }
      check(nameValue != null) { "name is required" }
      check(singleSelectOptionsValue != null) { "singleSelectOptions is required" }
      return InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a(
        dataType = dataType,
        name = name,
        singleSelectOptions = singleSelectOptions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a must be a JSON object")
      val dataType = json.decodeRequired<InlineUsersProjectsV2FieldsPostRequestJsonOneOf2DataTypeX72194ad5>(rawObject, "data_type")
      val name = json.decodeRequired<String>(rawObject, "name")
      val singleSelectOptions = json.decodeRequired<List<ProjectsV2FieldSingleSelectOption>>(rawObject, "single_select_options")
      return InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a(
        dataType = dataType,
        name = name,
        singleSelectOptions = singleSelectOptions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a")
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

public fun inlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a(block: InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a.Builder.() -> Unit): InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a = InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersProjectsV2FieldsPostRequestJsonOneOf2X5158768a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
