package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1identity~1verification_sessions~1{session}/post/requestBody/content/applica
 * tion~1x-www-form-urlencoded/schema/properties/options/properties/document/anyOf/0
 */
@Serializable(with = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586.Serializer::class)
public class InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586(
  allowedTypes: List<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb>? = null,
  public val requireIdNumber: Boolean? = null,
  public val requireLiveCapture: Boolean? = null,
  public val requireMatchingSelfie: Boolean? = null,
) {
  public val allowedTypes:
      List<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb>? =
      allowedTypes?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var allowedTypesValue:
        List<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb>? =
        null

    public var allowedTypes:
        List<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb>?
      get() = allowedTypesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        allowedTypesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var requireIdNumber: Boolean? = null

    public var requireLiveCapture: Boolean? = null

    public var requireMatchingSelfie: Boolean? = null

    public fun build(): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586(
      allowedTypes = allowedTypes,
      requireIdNumber = requireIdNumber,
      requireLiveCapture = requireLiveCapture,
      requireMatchingSelfie = requireMatchingSelfie,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 must be a JSON object")
      return InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586(
        allowedTypes = rawObject["allowed_types"]?.let { json.decodeFromJsonElement<List<InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1ItemXab00bbeb>>(it) },
        requireIdNumber = rawObject["require_id_number"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requireLiveCapture = rawObject["require_live_capture"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        requireMatchingSelfie = rawObject["require_matching_selfie"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.allowedTypes?.let { put("allowed_types", json.encodeToJsonElement(it)) }
        value.requireIdNumber?.let { put("require_id_number", json.encodeToJsonElement(it)) }
        value.requireLiveCapture?.let { put("require_live_capture", json.encodeToJsonElement(it)) }
        value.requireMatchingSelfie?.let { put("require_matching_selfie", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586(block: InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586.Builder.() -> Unit): InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586 = InlineV1IdentityVerificatid8e1PostRequestFormOptionsDocumentAnyOf1Xce121586.build(block)
