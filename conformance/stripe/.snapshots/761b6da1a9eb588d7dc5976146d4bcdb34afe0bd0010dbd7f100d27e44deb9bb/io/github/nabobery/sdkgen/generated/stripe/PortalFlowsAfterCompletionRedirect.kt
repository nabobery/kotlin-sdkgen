package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
import kotlinx.serialization.json.put

@Serializable
public data class PortalFlowsAfterCompletionRedirectView(
  @SerialName("return_url")
  public val returnUrl: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/portal_flows_after_completion_redirect
 */
@Serializable(with = PortalFlowsAfterCompletionRedirect.Serializer::class)
public class PortalFlowsAfterCompletionRedirect(
  /**
   * The URL the customer will be redirected to after the flow is completed.
   */
  public val returnUrl: String,
) {
  public class Builder {
    private var returnUrlValue: String? = null

    public var returnUrl: String
      get() = requireNotNull(returnUrlValue) { "returnUrl is required" }
      set(`value`) {
        returnUrlValue = value
      }

    public fun build(): PortalFlowsAfterCompletionRedirect {
      check(returnUrlValue != null) { "returnUrl is required" }
      return PortalFlowsAfterCompletionRedirect(
        returnUrl = returnUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PortalFlowsAfterCompletionRedirect = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PortalFlowsAfterCompletionRedirect> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PortalFlowsAfterCompletionRedirect {
      val jsonDecoder = decoder.requireJsonDecoder("PortalFlowsAfterCompletionRedirect")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PortalFlowsAfterCompletionRedirect must be a JSON object")
      val returnUrl = json.decodeRequired<String>(rawObject, "return_url")
      return PortalFlowsAfterCompletionRedirect(
        returnUrl = returnUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PortalFlowsAfterCompletionRedirect) {
      val jsonEncoder = encoder.requireJsonEncoder("PortalFlowsAfterCompletionRedirect")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("return_url", value.returnUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun portalFlowsAfterCompletionRedirect(block: PortalFlowsAfterCompletionRedirect.Builder.() -> Unit): PortalFlowsAfterCompletionRedirect = PortalFlowsAfterCompletionRedirect.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PortalFlowsAfterCompletionRedirect is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
