package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1capabilities~1{capability}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1capabilities~1{capability}/post/requestBody/content/ap
 * plication~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1AccountsCapabilitiesPostRequestFormX67548eb6.Serializer::class)
public class InlineV1AccountsCapabilitiesPostRequestFormX67548eb6(
  expand: List<String>? = null,
  /**
   * To request a new capability for an account, pass true. There can be a delay before the requested capability becomes
   * active. If the capability has any activation requirements, the response includes them in the `requirements` arrays.
   *
   * If a capability isn't permanent, you can remove it from the account by passing false. Some capabilities are
   * permanent after they've been requested. Attempting to remove a permanent capability returns an error.
   */
  public val requested: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * To request a new capability for an account, pass true. There can be a delay before the requested capability
     * becomes active. If the capability has any activation requirements, the response includes them in the
     * `requirements` arrays.
     *
     * If a capability isn't permanent, you can remove it from the account by passing false. Some capabilities are
     * permanent after they've been requested. Attempting to remove a permanent capability returns an error.
     */
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsCapabilitiesPostRequestFormX67548eb6 = InlineV1AccountsCapabilitiesPostRequestFormX67548eb6(
      expand = expand,
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsCapabilitiesPostRequestFormX67548eb6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsCapabilitiesPostRequestFormX67548eb6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsCapabilitiesPostRequestFormX67548eb6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsCapabilitiesPostRequestFormX67548eb6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsCapabilitiesPostRequestFormX67548eb6 must be a JSON object")
      return InlineV1AccountsCapabilitiesPostRequestFormX67548eb6(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsCapabilitiesPostRequestFormX67548eb6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsCapabilitiesPostRequestFormX67548eb6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsCapabilitiesPostRequestFormX67548eb6(block: InlineV1AccountsCapabilitiesPostRequestFormX67548eb6.Builder.() -> Unit): InlineV1AccountsCapabilitiesPostRequestFormX67548eb6 = InlineV1AccountsCapabilitiesPostRequestFormX67548eb6.build(block)
