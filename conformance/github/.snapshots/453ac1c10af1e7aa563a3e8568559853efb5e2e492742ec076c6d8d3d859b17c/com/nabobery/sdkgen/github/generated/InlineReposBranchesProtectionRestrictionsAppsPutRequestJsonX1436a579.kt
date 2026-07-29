package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1apps/put/
 * requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1apps/put/
 * requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579(
  apps: List<String>,
) {
  /**
   * The GitHub Apps that have push access to this branch. Use the slugified version of the app name. **Note**: The list
   * of users, apps, and teams in total is limited to 100 items.
   */
  public val apps: List<String> = apps.toList()

  public class Builder {
    private var appsValue: List<String>? = null

    public var apps: List<String>
      get() = requireNotNull(appsValue) { "apps is required" }.toList()
      set(`value`) {
        appsValue = value.toList()
      }

    public fun build(): InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579 {
      check(appsValue != null) { "apps is required" }
      return InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579(
        apps = apps,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579 must be a JSON object")
      val apps = json.decodeRequired<List<String>>(rawObject, "apps")
      return InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579(
        apps = apps,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apps", json.encodeToJsonElement(value.apps))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579(block: InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579 = InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsAppsPutRequestJsonX1436a579 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
