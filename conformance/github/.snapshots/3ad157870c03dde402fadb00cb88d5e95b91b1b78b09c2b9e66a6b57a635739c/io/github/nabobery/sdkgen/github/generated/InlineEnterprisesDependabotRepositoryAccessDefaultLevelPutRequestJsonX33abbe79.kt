package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1dependabot~1repository-access~1default-level/put/req
 * uestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1dependabot~1repository-access~1default-level/put/req
 * uestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79.Serializer::class)
public class InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79(
  /**
   * The default repository access level for Dependabot updates.
   */
  public val defaultLevel: InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead,
) {
  public class Builder {
    private var defaultLevelValue:
        InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead? = null

    public var defaultLevel: InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead
      get() = requireNotNull(defaultLevelValue) { "defaultLevel is required" }
      set(`value`) {
        defaultLevelValue = value
      }

    public fun build(): InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79 {
      check(defaultLevelValue != null) { "defaultLevel is required" }
      return InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79(
        defaultLevel = defaultLevel,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79 must be a JSON object")
      val defaultLevel = json.decodeRequired<InlineEnterprisesDependabo1cd6PutRequestJsonDefaultLevelX3b59cead>(rawObject, "default_level")
      return InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79(
        defaultLevel = defaultLevel,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("default_level", json.encodeToJsonElement(value.defaultLevel))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79(block: InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79.Builder.() -> Unit): InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79 = InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesDependabotRepositoryAccessDefaultLevelPutRequestJsonX33abbe79 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
