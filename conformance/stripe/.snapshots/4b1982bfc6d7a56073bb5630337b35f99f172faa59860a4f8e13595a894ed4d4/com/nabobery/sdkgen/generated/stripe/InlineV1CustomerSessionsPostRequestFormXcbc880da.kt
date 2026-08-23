package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customer_sessions/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema
 */
@Serializable(with = InlineV1CustomerSessionsPostRequestFormXcbc880da.Serializer::class)
public class InlineV1CustomerSessionsPostRequestFormXcbc880da(
  /**
   * Configuration for each component. At least 1 component must be enabled.
   */
  public val components: InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1,
  /**
   * The ID of an existing customer for which to create the Customer Session.
   */
  public val customer: String? = null,
  /**
   * The ID of an existing Account for which to create the Customer Session.
   */
  public val customerAccount: String? = null,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var componentsValue: InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1? = null

    public var components: InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1
      get() = requireNotNull(componentsValue) { "components is required" }
      set(`value`) {
        componentsValue = value
      }

    /**
     * The ID of an existing customer for which to create the Customer Session.
     */
    public var customer: String? = null

    /**
     * The ID of an existing Account for which to create the Customer Session.
     */
    public var customerAccount: String? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1CustomerSessionsPostRequestFormXcbc880da {
      check(componentsValue != null) { "components is required" }
      return InlineV1CustomerSessionsPostRequestFormXcbc880da(
        components = components,
        customer = customer,
        customerAccount = customerAccount,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormXcbc880da = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CustomerSessionsPostRequestFormXcbc880da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomerSessionsPostRequestFormXcbc880da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomerSessionsPostRequestFormXcbc880da")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormXcbc880da must be a JSON object")
      val components = json.decodeRequired<InlineV1CustomerSessionsPostRequestFormComponentsX6c4299e1>(rawObject, "components")
      return InlineV1CustomerSessionsPostRequestFormXcbc880da(
        components = components,
        customer = rawObject["customer"]?.let { json.decodeFromJsonElement<String>(it) },
        customerAccount = rawObject["customer_account"]?.let { json.decodeFromJsonElement<String>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomerSessionsPostRequestFormXcbc880da) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CustomerSessionsPostRequestFormXcbc880da")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("components", json.encodeToJsonElement(value.components))
        value.customer?.let { put("customer", it) }
        value.customerAccount?.let { put("customer_account", it) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CustomerSessionsPostRequestFormXcbc880da(block: InlineV1CustomerSessionsPostRequestFormXcbc880da.Builder.() -> Unit): InlineV1CustomerSessionsPostRequestFormXcbc880da = InlineV1CustomerSessionsPostRequestFormXcbc880da.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CustomerSessionsPostRequestFormXcbc880da is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
