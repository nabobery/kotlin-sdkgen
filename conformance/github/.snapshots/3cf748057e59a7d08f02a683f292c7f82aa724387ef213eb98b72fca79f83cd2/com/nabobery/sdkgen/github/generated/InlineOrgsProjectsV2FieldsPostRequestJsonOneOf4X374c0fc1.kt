package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/3.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1fields/post/requestBody/content/appl
 * ication~1json/schema/oneOf/3
 */
@Serializable(with = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1.Serializer::class)
public class InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1(
  /**
   * The field's data type.
   */
  public val dataType: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09,
  public val iterationConfiguration: ProjectsV2FieldIterationConfiguration,
  /**
   * The name of the field.
   */
  public val name: String,
) {
  public class Builder {
    private var dataTypeValue: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09? =
        null

    public var dataType: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

    private var iterationConfigurationValue: ProjectsV2FieldIterationConfiguration? = null

    public var iterationConfiguration: ProjectsV2FieldIterationConfiguration
      get() = requireNotNull(iterationConfigurationValue) { "iterationConfiguration is required" }
      set(`value`) {
        iterationConfigurationValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1 {
      check(dataTypeValue != null) { "dataType is required" }
      check(iterationConfigurationValue != null) { "iterationConfiguration is required" }
      check(nameValue != null) { "name is required" }
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1(
        dataType = dataType,
        iterationConfiguration = iterationConfiguration,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1 must be a JSON object")
      val dataType = json.decodeRequired<InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4DataTypeXcc00ff09>(rawObject, "data_type")
      val iterationConfiguration = json.decodeRequired<ProjectsV2FieldIterationConfiguration>(rawObject, "iteration_configuration")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1(
        dataType = dataType,
        iterationConfiguration = iterationConfiguration,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("iteration_configuration", json.encodeToJsonElement(value.iterationConfiguration))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1(block: InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1.Builder.() -> Unit): InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1 = InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2FieldsPostRequestJsonOneOf4X374c0fc1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
