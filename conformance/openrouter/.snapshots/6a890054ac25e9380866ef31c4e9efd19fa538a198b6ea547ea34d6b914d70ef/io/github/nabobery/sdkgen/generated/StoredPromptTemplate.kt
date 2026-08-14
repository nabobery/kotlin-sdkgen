package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/StoredPromptTemplate.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/StoredPromptTemplate
 */
@Serializable(with = StoredPromptTemplate.Serializer::class)
public class StoredPromptTemplate(
  public val id: String,
  variables: Map<String, InlineStoredPromptTemplateVariablesAdditionalValueX258ee251>? = null,
) {
  public val variables: Map<String, InlineStoredPromptTemplateVariablesAdditionalValueX258ee251>? =
      variables?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var variablesValue:
        Map<String, InlineStoredPromptTemplateVariablesAdditionalValueX258ee251>? = null

    public var variables: Map<String, InlineStoredPromptTemplateVariablesAdditionalValueX258ee251>?
      get() = variablesValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        variablesValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): StoredPromptTemplate {
      check(idValue != null) { "id is required" }
      return StoredPromptTemplate(
        id = id,
        variables = variables,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): StoredPromptTemplate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<StoredPromptTemplate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): StoredPromptTemplate {
      val jsonDecoder = decoder.requireJsonDecoder("StoredPromptTemplate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("StoredPromptTemplate must be a JSON object")
      val id = json.decodeRequired<String>(rawObject, "id")
      return StoredPromptTemplate(
        id = id,
        variables = rawObject["variables"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Map<String, InlineStoredPromptTemplateVariablesAdditionalValueX258ee251>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: StoredPromptTemplate) {
      val jsonEncoder = encoder.requireJsonEncoder("StoredPromptTemplate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", value.id)
        value.variables?.let { put("variables", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun storedPromptTemplate(block: StoredPromptTemplate.Builder.() -> Unit): StoredPromptTemplate = StoredPromptTemplate.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("StoredPromptTemplate is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
