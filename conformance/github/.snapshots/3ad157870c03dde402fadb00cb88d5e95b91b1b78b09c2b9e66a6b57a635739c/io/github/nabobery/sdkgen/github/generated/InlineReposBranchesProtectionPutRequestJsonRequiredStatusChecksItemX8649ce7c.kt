package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/required_status_checks/properties/checks/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection/put/requestBody/content/
 * application~1json/schema/properties/required_status_checks/properties/checks/items
 */
@Serializable(with = InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c.Serializer::class)
public class InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c(
  /**
   * The name of the required check
   */
  public val context: String,
  /**
   * The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App that
   * has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow any app
   * to set the status.
   */
  public val appId: Int? = null,
) {
  public class Builder {
    private var contextValue: String? = null

    public var context: String
      get() = requireNotNull(contextValue) { "context is required" }
      set(`value`) {
        contextValue = value
      }

    /**
     * The ID of the GitHub App that must provide this check. Omit this field to automatically select the GitHub App
     * that has recently provided this check, or any app if it was not set by a GitHub App. Pass -1 to explicitly allow
     * any app to set the status.
     */
    public var appId: Int? = null

    public fun build(): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c {
      check(contextValue != null) { "context is required" }
      return InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c(
        context = context,
        appId = appId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c must be a JSON object")
      val context = json.decodeRequired<String>(rawObject, "context")
      return InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c(
        context = context,
        appId = rawObject["app_id"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("context", value.context)
        value.appId?.let { put("app_id", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c(block: InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c.Builder.() -> Unit): InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c = InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposBranchesProtectionPutRequestJsonRequiredStatusChecksItemX8649ce7c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
