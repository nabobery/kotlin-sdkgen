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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1apps/post
 * /requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1restrictions~1apps/post
 * /requestBody/content/application~1json/schema
 */
@Serializable(with = InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732.Serializer::class)
public class InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732(
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

    public fun build(): InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732 {
      check(appsValue != null) { "apps is required" }
      return InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732(
        apps = apps,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732 must be a JSON object")
      val apps = json.decodeRequired<List<String>>(rawObject, "apps")
      return InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732(
        apps = apps,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("apps", json.encodeToJsonElement(value.apps))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732(block: InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732.Builder.() -> Unit): InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732 = InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionRestrictionsAppsPostRequestJsonX4c4b3732 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
