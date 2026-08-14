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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1repository-access~1default-level/put/requestBody/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1dependabot~1repository-access~1default-level/put/requestBody/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319.Serializer::class)
public class InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319(
  /**
   * The default repository access level for Dependabot updates.
   */
  public val defaultLevel: InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0,
) {
  public class Builder {
    private var defaultLevelValue:
        InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0? = null

    public var defaultLevel: InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0
      get() = requireNotNull(defaultLevelValue) { "defaultLevel is required" }
      set(`value`) {
        defaultLevelValue = value
      }

    public fun build(): InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319 {
      check(defaultLevelValue != null) { "defaultLevel is required" }
      return InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319(
        defaultLevel = defaultLevel,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319 must be a JSON object")
      val defaultLevel = json.decodeRequired<InlineOrgsDependabotReposi6526PutRequestJsonDefaultLevelXb2b561b0>(rawObject, "default_level")
      return InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319(
        defaultLevel = defaultLevel,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("default_level", json.encodeToJsonElement(value.defaultLevel))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319(block: InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319.Builder.() -> Unit): InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319 = InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsDependabotRepositoryAccessDefaultLevelPutRequestJsonX859e2319 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
