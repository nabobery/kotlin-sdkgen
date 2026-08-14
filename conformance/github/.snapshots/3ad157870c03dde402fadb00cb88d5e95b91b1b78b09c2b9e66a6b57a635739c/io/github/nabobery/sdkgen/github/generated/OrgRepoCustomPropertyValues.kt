package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * List of custom property values for a repository
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/org-repo-custom-property-values
 */
@Serializable(with = OrgRepoCustomPropertyValues.Serializer::class)
public class OrgRepoCustomPropertyValues(
  properties: List<CustomPropertyValue>,
  public val repositoryFullName: String,
  public val repositoryId: Int,
  public val repositoryName: String,
) {
  /**
   * List of custom property names and associated values
   */
  public val properties: List<CustomPropertyValue> = properties.toList()

  public class Builder {
    private var propertiesValue: List<CustomPropertyValue>? = null

    public var properties: List<CustomPropertyValue>
      get() = requireNotNull(propertiesValue) { "properties is required" }.toList()
      set(`value`) {
        propertiesValue = value.toList()
      }

    private var repositoryFullNameValue: String? = null

    public var repositoryFullName: String
      get() = requireNotNull(repositoryFullNameValue) { "repositoryFullName is required" }
      set(`value`) {
        repositoryFullNameValue = value
      }

    private var repositoryIdValue: Int? = null

    public var repositoryId: Int
      get() = requireNotNull(repositoryIdValue) { "repositoryId is required" }
      set(`value`) {
        repositoryIdValue = value
      }

    private var repositoryNameValue: String? = null

    public var repositoryName: String
      get() = requireNotNull(repositoryNameValue) { "repositoryName is required" }
      set(`value`) {
        repositoryNameValue = value
      }

    public fun build(): OrgRepoCustomPropertyValues {
      check(propertiesValue != null) { "properties is required" }
      check(repositoryFullNameValue != null) { "repositoryFullName is required" }
      check(repositoryIdValue != null) { "repositoryId is required" }
      check(repositoryNameValue != null) { "repositoryName is required" }
      return OrgRepoCustomPropertyValues(
        properties = properties,
        repositoryFullName = repositoryFullName,
        repositoryId = repositoryId,
        repositoryName = repositoryName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrgRepoCustomPropertyValues = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrgRepoCustomPropertyValues> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrgRepoCustomPropertyValues {
      val jsonDecoder = decoder.requireJsonDecoder("OrgRepoCustomPropertyValues")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrgRepoCustomPropertyValues must be a JSON object")
      val properties = json.decodeRequired<List<CustomPropertyValue>>(rawObject, "properties")
      val repositoryFullName = json.decodeRequired<String>(rawObject, "repository_full_name")
      val repositoryId = json.decodeRequired<Int>(rawObject, "repository_id")
      val repositoryName = json.decodeRequired<String>(rawObject, "repository_name")
      return OrgRepoCustomPropertyValues(
        properties = properties,
        repositoryFullName = repositoryFullName,
        repositoryId = repositoryId,
        repositoryName = repositoryName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrgRepoCustomPropertyValues) {
      val jsonEncoder = encoder.requireJsonEncoder("OrgRepoCustomPropertyValues")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("properties", json.encodeToJsonElement(value.properties))
        put("repository_full_name", value.repositoryFullName)
        put("repository_id", json.encodeToJsonElement(value.repositoryId))
        put("repository_name", value.repositoryName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun orgRepoCustomPropertyValues(block: OrgRepoCustomPropertyValues.Builder.() -> Unit): OrgRepoCustomPropertyValues = OrgRepoCustomPropertyValues.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrgRepoCustomPropertyValues is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
